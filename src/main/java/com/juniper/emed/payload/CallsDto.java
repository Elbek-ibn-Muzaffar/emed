package com.juniper.emed.payload;

import com.juniper.emed.entity.CallsCategory;
import com.juniper.emed.entity.Deseases;
import com.juniper.emed.entity.Users;
import lombok.Data;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Data
public class CallsDto {

    private Long id;

    private Long usersId;

    private String location;

    private String deseasesId;

    private Long callsCategoryId;


}
