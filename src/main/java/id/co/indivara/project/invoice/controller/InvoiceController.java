package id.co.indivara.project.invoice.controller;

import id.co.indivara.project.invoice.entity.Invoice;
import id.co.indivara.project.invoice.services.InvoiceService;
import id.co.indivara.project.invoice.services.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.persistence.OrderBy;
import java.util.*;

@RestController
@RequestMapping("/api/v1/loops")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;



    @GetMapping("/history")
    public Page<Invoice> history(){
        return invoiceService.listOfTransaction();
    }

//    @GetMapping("/history/all")
//    public List<Invoice> listTransaksi(){
//        return invoiceService.listOfTransaction();
//    }

//    @PostMapping("/invoice")
//    public Invoice saveInvoice(@RequestBody Invoice invoice){
//        return invoiceService.saveInvoice(invoice);
//    }

//    @GetMapping("/history/{id}")
//    public List<Invoice> cariInvoiceDenganIdUrutkanDariKecil(@PathVariable("id") Long orderId)
//    {
//        return invoiceService.findOrderIdOrderByOrderIdAsc(orderId);
//    }

//    @GetMapping("/history/all")
//    public List<Invoice> semuaData(@RequestBody Invoice invoice,
//                                   @PathVariable("id") Long orderId)
//    {
//        return  invoiceService.findAllOrderByOrderIdDesc(invoice,orderId);
//    }
}
