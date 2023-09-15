package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product_log", schema = "public")
public class ProductLog {

    @Id
    @SequenceGenerator(name = "productLogSeq", allocationSize = 1, sequenceName = "product_log_product_id_seq", schema = "public")
    @GeneratedValue(generator = "productLogSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "last_modified_date_time")
    private LocalDateTime lastModifiedDateTime;

    @Column(name = "last_modified_user")
    private String lastModifiedUser;

    @Column(name = "pricing_id")
    private Integer pricingId;

    @Column(name = "product_buying_price")
    private BigDecimal productBuyingPrice;

    @Column(name = "product_is_service")
    private Byte productIsService;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_selling_price")
    private BigDecimal productSellingPrice;

    @Column(name = "version")
    private BigDecimal version;

}
