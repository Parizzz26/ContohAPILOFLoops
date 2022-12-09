package id.co.indivara.project.invoice.services;

import id.co.indivara.project.invoice.entity.Invoice;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.data.domain.Page;

import javax.persistence.OrderBy;
import java.util.List;


public interface InvoiceService {
    Page<Invoice> listOfTransaction();
    //page dikgunakan untuk menggantikan list digunakan untuk memudahkan implementasi query pada jpa
}
