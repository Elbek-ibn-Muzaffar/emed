package com.juniper.emed.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Users users;

    private String location;

    @ManyToOne
    private Deseases deseases;

    @ManyToOne
    private CallsCategory callsCategory;

    private Integer isConfirmed;

    @CreatedDate
    private Date date = new Date();
}
