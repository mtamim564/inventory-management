package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_pricing", schema = "public")
public class ProductPricing {

    @Id
    @SequenceGenerator(name = "productPricingSeq", allocationSize = 1, sequenceName = "product_pricing_ref_id_seq", schema = "public")
    @GeneratedValue(generator = "productPricingSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "ref_id")
    private int refId;

    private Pricing pricing;

    private Product product;

}
