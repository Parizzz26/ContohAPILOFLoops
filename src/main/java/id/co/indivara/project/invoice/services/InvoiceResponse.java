package id.co.indivara.project.invoice.services;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class InvoiceResponse {
    private BigDecimal price;
    private Date createdDate;
    private String jenis;
    private String company;
    private String user;
}
