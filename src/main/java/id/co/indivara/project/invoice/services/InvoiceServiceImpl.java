package id.co.indivara.project.invoice.services;

import id.co.indivara.project.invoice.entity.Invoice;
import id.co.indivara.project.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public Page<Invoice> listOfTransaction(){
        return (Page<Invoice>) invoiceRepository.findAll(PageRequest.of(0,5, Sort.by(Sort.Direction.DESC, "orderId")));
    }//page dikgunakan untuk menggantikan list digunakan untuk memudahkan implementasi query pada jpa


}
