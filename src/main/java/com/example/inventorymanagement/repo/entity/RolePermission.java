package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role_permission", schema = "public")
public class RolePermission {

    @Id
    @SequenceGenerator(name = "rolePermissionSeq", allocationSize = 1, sequenceName = "role_permission_ref_id_seq", schema = "public")
    @GeneratedValue(generator = "rolePermissionSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "ref_id")
    private Integer refId;

    private Permission permission;

    private Role role;

}
