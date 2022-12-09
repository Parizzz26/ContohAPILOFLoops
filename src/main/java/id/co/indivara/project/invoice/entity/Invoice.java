package id.co.indivara.project.invoice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {
    @Id
    @OrderBy(value = "{orderId} DESC")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @NotEmpty
    private String jenis;

    @NotEmpty
    private String company;
//    private String gambar;
    @NotEmpty
    private BigDecimal price;

    private Date createdDate;


}
