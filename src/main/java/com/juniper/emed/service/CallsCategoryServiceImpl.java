package com.juniper.emed.service;

import com.juniper.emed.entity.CallsCategory;
import com.juniper.emed.repository.CallsCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallsCategoryServiceImpl implements CallsCategoryService{
    @Autowired
    private CallsCategoryRepository callsCategoryRepository;

    @Override
    public List<CallsCategory> getAll() {
        return callsCategoryRepository.findAll();
    }

    @Override
    public CallsCategory getOne(Long id) {
        return callsCategoryRepository.findById(id).get();
    }

    @Override
    public CallsCategory save(CallsCategory callsCategory) {
        return callsCategoryRepository.save(callsCategory);
    }
}
