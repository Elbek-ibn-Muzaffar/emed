package com.juniper.emed.service;

import com.juniper.emed.entity.Deseases;
import com.juniper.emed.payload.DeseaseDto;
import com.juniper.emed.repository.CaseCategoryRepository;
import com.juniper.emed.repository.DeseasesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeseaseServiceImpl implements DeseasesService {
    @Autowired
    private DeseasesRepository deseasesRepository;

    @Autowired
    private CaseCategoryRepository caseCategoryRepository;

    @Override
    public Deseases save(DeseaseDto deseases) {
        ModelMapper modelMapper=new ModelMapper();
        Deseases deseases1=modelMapper.map(deseases,Deseases.class);
        deseases1.setCaseCategory(caseCategoryRepository.findById(deseases.getCategoryId()).get());
        return deseasesRepository.save(deseases1);
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

    @Override
    public String deleteAll() {
        deseasesRepository.deleteAll();
        return "O'chirildi";
    }
}
