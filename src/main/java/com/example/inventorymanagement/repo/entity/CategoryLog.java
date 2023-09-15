package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "category_log", schema = "public")
public class CategoryLog {

    @Id
    @SequenceGenerator(name = "categoryLogSeq", allocationSize = 1, sequenceName = "category_log_category_id_seq", schema = "public")
    @GeneratedValue(generator = "categoryLogSeq", strategy = GenerationType.SEQUENCE)
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
    private BigDecimal version;

}
