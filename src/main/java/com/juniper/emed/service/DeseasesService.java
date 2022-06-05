package com.juniper.emed.service;

import com.juniper.emed.entity.Deseases;

import java.util.List;

public interface DeseasesService {

    Deseases save(Deseases deseases);

    Deseases getOne(Long id);

    List<Deseases> getAll();

    List<Deseases> getByCategoryId(Long categoryId);
}
