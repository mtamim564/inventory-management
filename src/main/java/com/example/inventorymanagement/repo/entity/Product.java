package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "product", schema = "public")
public class Product {

    @Id
    @SequenceGenerator(name = "productSeq", allocationSize = 1, sequenceName = "product_product_id_seq", schema = "public")
    @GeneratedValue(generator = "productSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "last_modified_date_time")
    private LocalDateTime lastModifiedDateTime;

    @Column(name = "last_modified_user")
    private String lastModifiedUser;

    @Column(name = "product_buying_price")
    private BigDecimal productBuyingPrice;

    //should this be Boolean seems like a true or false?
    @Column(name = "product_is_service")
    private Byte productIsService;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_selling_price")
    private BigDecimal productSellingPrice;

    @Column(name = "version")
    private BigDecimal version;

    //for categoryId
    private Category category;

    private List<ProductInvoice> productInvoices;

    private List<ProductPricing> productPricings;

    private List<Stock> stocks;

}
