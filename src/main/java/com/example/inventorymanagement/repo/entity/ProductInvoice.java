package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_invoice", schema = "public")
public class ProductInvoice {

    @Id
    @SequenceGenerator(name = "productInvoiceSeq", allocationSize = 1, sequenceName = "product_invoice_ref_id_seq", schema = "public")
    @GeneratedValue(generator = "productInvoiceSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "ref_id")
    private Integer refId;

    private Invoice invoice;

    private Product product;

}
