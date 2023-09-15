package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "role", schema = "public")
public class Role {

    @Id
    @SequenceGenerator(name = "roleSeq", allocationSize = 1, sequenceName = "role_role_id_seq", schema = "public")
    @GeneratedValue(generator = "roleSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "role_id")
    private Integer roleId;

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

    private List<RolePermission> rolePermissions;

    private List<UserRole> userRoles;

}
