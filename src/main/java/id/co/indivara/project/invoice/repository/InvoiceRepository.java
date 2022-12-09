package id.co.indivara.project.invoice.repository;

import id.co.indivara.project.invoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
//    List<Invoice> findAll(Long orderId);
////    List<Invoice> findByOrderIdOrderByOrderId(Long orderId);
//
//    List<Invoice> findByOrderIdOrderByOrderId(Invoice invoice, Long orderId);
}