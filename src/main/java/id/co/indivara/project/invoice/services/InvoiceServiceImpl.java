package id.co.indivara.project.invoice.services;

import id.co.indivara.project.invoice.entity.Invoice;
import id.co.indivara.project.invoice.repository.InvoiceRepository;
import net.bytebuddy.TypeCache;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public Page<Invoice> listOfTransaction(){
        return (Page<Invoice>) invoiceRepository.findAll(PageRequest.of(0,5, Sort.by(Sort.Direction.DESC, "orderId")));
    };

//    @Override
//    public List<Invoice> historyTransaksi(DetachedCriteria dc) {
//        Criteria cr = session
//        return find;
//    }

    //    public List<Invoice> findOrderIdOrderByOrderIdAsc(Long orderId)
//    {
//        return invoiceRepository.findByOrderIdOrderByOrderId(orderId);
//    }

//    public List<Invoice> findAllOrderByOrderIdDesc(Invoice invoice, Long orderId){
//        return invoiceRepository.findByOrderIdOrderByOrderId(invoice,orderId);
//    }
}
