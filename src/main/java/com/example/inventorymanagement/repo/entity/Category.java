package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "category", schema = "public")
public class Category {

    @Id
    @SequenceGenerator(name = "categorySeq", allocationSize = 1, sequenceName = "category_category_id_seq", schema = "public")
    @GeneratedValue(generator = "categorySeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "last_modified_date_time")
    private LocalDateTime lastModifiedDateTime;

    @Column(name = "last_modified_user")
    private String lastModifiedUser;

    @Column(name = "version")
    private Long version;

    private List<Product> products;

    private List<Stock> stocks;

}
