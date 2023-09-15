package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "invoice", schema = "public")
public class Invoice {

    @Id
    @SequenceGenerator(name = "invoiceSeq", allocationSize = 1, sequenceName = "invoice_invoice_id_seq", schema = "public")
    @GeneratedValue(generator = "invoiceSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "invoice_id")
    private Integer invoiceId;

    @Column(name = "line_total")
    private BigDecimal lineTotal;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "version")
    private BigDecimal version;

    private List<ProductInvoice> productInvoices;

}
