package com.juniper.emed.service;

import com.juniper.emed.entity.Deseases;
import com.juniper.emed.repository.DeseasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeseaseServiceImpl implements DeseasesService {
    @Autowired
    private DeseasesRepository deseasesRepository;

    @Override
    public Deseases save(Deseases deseases) {
        return deseasesRepository.save(deseases);
    }

    @Override
    public Deseases getOne(Long id) {
        if (deseasesRepository.existsById(id))
        {
            return deseasesRepository.findById(id).get();
        }
        return new Deseases();
    }

    @Override
    public List<Deseases> getAll() {
        return deseasesRepository.findAll();
    }

    @Override
    public List<Deseases> getByCategoryId(Long categoryId) {
        return deseasesRepository.findAllByCaseCategoryId(categoryId);
    }
}
