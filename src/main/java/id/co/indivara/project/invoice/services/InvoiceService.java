package id.co.indivara.project.invoice.services;

import id.co.indivara.project.invoice.entity.Invoice;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.data.domain.Page;

import javax.persistence.OrderBy;
import java.util.List;


public interface InvoiceService {
    Page<Invoice> listOfTransaction();

//    List<Invoice> historyTransaksi(DetachedCriteria dc);

//    List<Invoice> findOrderIdOrderByOrderIdAsc(Long orderId);
//    List<Invoice> findAllOrderByOrderIdDesc(Invoice invoice, Long orderId);
}
