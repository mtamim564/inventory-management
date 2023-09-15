package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "role_log", schema = "public")
public class RoleLog {

    @Id
    @SequenceGenerator(name = "roleLogSeq", allocationSize = 1, sequenceName = "role_log_role_id_seq", schema = "public")
    @GeneratedValue(generator = "roleLogSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "created_date_time")
    private LocalDateTime createdDateTime;

    @Column(name = "created_user")
    private String createdUser;

    @Column(name = "last_modified_date_time")
    private LocalDateTime lastModifiedDateTime;

    @Column(name = "last_modified_user")
    private String lastModifiedUser;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "version")
    private BigDecimal version;

}
