package com.juniper.emed.service;

import com.juniper.emed.entity.CaseCategory;
import com.juniper.emed.repository.CaseCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseCategoryServiceImpl implements CaseCategoryService{

    private CaseCategoryRepository caseCategoryRepository;

    public CaseCategoryServiceImpl(CaseCategoryRepository caseCategoryRepository) {
        this.caseCategoryRepository = caseCategoryRepository;
    }

    @Override
    public List<CaseCategory> getAll() {
       return caseCategoryRepository.findAll();
    }

    @Override
    public CaseCategory getOne(Long id) {
        if (caseCategoryRepository.existsById(id))
        {
           return caseCategoryRepository.findById(id).get();
        }
        return new CaseCategory();
    }

    @Override
    public CaseCategory save(CaseCategory caseCategory) {
        return caseCategoryRepository.save(caseCategory);
    }
}
