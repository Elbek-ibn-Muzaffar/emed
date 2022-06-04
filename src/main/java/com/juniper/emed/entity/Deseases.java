package com.juniper.emed.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Deseases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameRu;

    private String nameUz;

    private String nameUk;

    @ManyToOne
    private DeseaseCategories deseaseCategories;

    @CreatedBy
    private String createdUsersId;

    @CreatedDate
    private Date date= new Date();
}
