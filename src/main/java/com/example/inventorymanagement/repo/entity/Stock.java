package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "stock", schema = "public")
public class Stock {

    @Id
    @SequenceGenerator(name = "stockSeq", allocationSize = 1, sequenceName = "stock_ref_id_seq", schema = "public")
    @GeneratedValue(generator = "stockSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "ref_id")
    private Integer refId;

    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "date_stock")
    private LocalDateTime dateStock;

    @Column(name = "last_modified_date_time")
    private LocalDateTime lastModifiedDateTime;

    @Column(name = "last_modified_user")
    private String lastModifiedUser;

    @Column(name = "quantity")
    private Integer quantity;

    //private int stockId; he left this field as a comment

    @Column(name = "version")
    private BigDecimal version;

    //for productId
    private Product product;

    //for supplierId
    private Supplier supplier;

    //for categoryId
    private Category category;

}
