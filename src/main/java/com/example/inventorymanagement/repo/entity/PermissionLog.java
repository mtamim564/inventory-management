package com.example.inventorymanagement.repo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "permission_log", schema = "public")
public class PermissionLog {

    @Id
    @SequenceGenerator(name = "permissionLogSeq", allocationSize = 1, sequenceName = "permission_log_permission_id_seq", schema = "public")
    @GeneratedValue(generator = "permissionLogSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "permission_id")
    private Integer permissionId;

    @Column(name = "permission_name")
    private String permissionName;


}
