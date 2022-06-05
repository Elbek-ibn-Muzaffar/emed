package com.juniper.emed.service;

import com.juniper.emed.entity.Deseases;
import com.juniper.emed.payload.DeseaseDto;

import java.util.List;

public interface DeseasesService {

    Deseases save(DeseaseDto deseases);

    Deseases getOne(Long id);

    List<Deseases> getAll();

    List<Deseases> getByCategoryId(Long categoryId);

    String deleteAll();
}
