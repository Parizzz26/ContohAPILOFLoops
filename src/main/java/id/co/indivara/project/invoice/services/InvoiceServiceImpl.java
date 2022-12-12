package id.co.indivara.project.invoice.services;

import id.co.indivara.project.invoice.entity.Invoice;
import id.co.indivara.project.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Date;


@Service
@Validated
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public Page<Invoice> listOfTransaction(){
        return (Page<Invoice>) invoiceRepository.findAll(PageRequest.of(0,5, Sort.by(Sort.Direction.DESC, "orderId")));
    }//page dikgunakan untuk menggantikan list digunakan untuk memudahkan implementasi query pada jpa

    @Override
    public InvoiceResponse saveInvoice(InvoiceRequest request) {
        Invoice invoice = new Invoice();
        invoice.setUser(request.getUser());
        invoice.setJenis(request.getJenis());
        invoice.setCompany(request.getCompany());
        invoice.setPrice(request.getPrice());
        invoice.setCreatedDate(new Date());
        invoiceRepository.save(invoice);
        Invoice i = invoiceRepository.save(invoice);
        InvoiceResponse response = new InvoiceResponse();
        response.setPrice(i.getPrice());
        response.setCreatedDate(i.getCreatedDate());
        response.setUser(i.getUser());
        response.setJenis(i.getJenis());
        response.setCompany(i.getCompany());
        return response;
    }
}
