package com.juniper.emed.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Roles {
    @Id
    private Long id;

    private String name;
}
