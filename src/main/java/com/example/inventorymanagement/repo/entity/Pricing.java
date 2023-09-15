package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "pricing", schema = "public")
public class Pricing {

    @Id
    @SequenceGenerator(name = "pricingSeq", allocationSize = 1, sequenceName = "pricing_pricing_id_seq", schema = "public")
    @GeneratedValue(generator = "pricingSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "pricing_id")
    private Integer pricingId;

    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "last_modified_date_time")
    private LocalDateTime lastModifiedDateTime;

    @Column(name = "last_modified_user")
    private String lastModifiedUser;

    @Column(name = "pricing_discount_percentage")
    private BigDecimal pricingDiscountPercentage;

    @Column(name = "pricing_effective_date")
    private LocalDateTime pricingEffectiveDate;

    @Column(name = "pricing_expire_date")
    private LocalDateTime pricingExpireDate;

    @Column(name = "pricing_name")
    private String pricingName;

    @Column(name = "version")
    private BigDecimal version;

    private List<ProductPricing> productPricings;

}
