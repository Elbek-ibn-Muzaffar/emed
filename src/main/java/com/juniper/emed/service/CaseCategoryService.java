package com.juniper.emed.service;

import com.juniper.emed.entity.CaseCategory;

import java.util.List;

public interface CaseCategoryService {
    List<CaseCategory> getAll();

    CaseCategory getOne(Long id);

    CaseCategory save(CaseCategory caseCategory);
}
