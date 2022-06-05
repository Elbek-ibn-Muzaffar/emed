package com.juniper.emed.service;

import com.juniper.emed.entity.CallsCategory;

import java.util.List;

public interface CallsCategoryService {

    List<CallsCategory> getAll();

    CallsCategory getOne(Long id);

    CallsCategory save(CallsCategory callsCategory);
}
