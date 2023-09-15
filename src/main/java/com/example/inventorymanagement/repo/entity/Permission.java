package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "permission", schema = "public")
public class Permission {

    @Id
    @SequenceGenerator(name = "permissionSeq", allocationSize = 1, sequenceName = "permission_permission_id_seq", schema = "public")
    @GeneratedValue(generator = "permissionSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "permission_id")
    private Integer permissionId;

    @Column(name = "permission_name")
    private String permissionName;

    private List<RolePermission> rolePermissions;

}
