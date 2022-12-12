package id.co.indivara.project.invoice.services;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InvoiceRequest {
    private BigDecimal price;
    private String jenis;
    private String company;
    private String user;
}
