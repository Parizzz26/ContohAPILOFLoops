package id.co.indivara.project.invoice.controller;

import id.co.indivara.project.invoice.entity.Invoice;
import id.co.indivara.project.invoice.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/loops")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;



    @GetMapping("/history")
    public Page<Invoice> history(){
        return invoiceService.listOfTransaction();
    } //page dikgunakan untuk menggantikan list digunakan untuk memudahkan implementasi query pada jpa

}
