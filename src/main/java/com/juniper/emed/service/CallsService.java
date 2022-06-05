package com.juniper.emed.service;

import com.juniper.emed.entity.Calls;
import com.juniper.emed.payload.CallsDto;
import com.juniper.emed.payload.DeseaseDto;

import java.util.List;

public interface CallsService {
    Calls save(CallsDto calls);

    List<Calls> getAll();

    Calls getOne(Long id);

    Calls confirmCall(Long id, Long deseaseId);
}
