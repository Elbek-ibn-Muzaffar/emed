package com.juniper.emed.service;

import com.juniper.emed.entity.Calls;
import com.juniper.emed.payload.CallsDto;
import com.juniper.emed.repository.CallsCategoryRepository;
import com.juniper.emed.repository.CallsRepository;
import com.juniper.emed.repository.DeseasesRepository;
import com.juniper.emed.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CallsServiceImpl implements CallsService{

    @Autowired
    private CallsRepository callsRepository;

    @Autowired
    private CallsCategoryRepository callsCategoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DeseasesRepository deseasesRepository;

    ModelMapper modelMapper=new ModelMapper();
    @Override
    public Calls save(CallsDto calls) {
        Calls calls1=modelMapper.map(calls,Calls.class);
        calls1.setUsers(userRepository.findById(calls.getUsersId()).get());
        calls1.setCallsCategory(callsCategoryRepository.findById(calls.getCallsCategoryId()).get());
        return callsRepository.save(calls1);
    }

    @Override
    public List<Calls> getAll() {
        return callsRepository.findAll();
    }

    @Override
    public Calls getOne(Long id) {
        return callsRepository.findById(id).get();
    }

    @Override
    public Calls confirmCall(Long id, Long deseaseId) {
        Calls calls= callsRepository.findById(id).get();
        calls.setDeseases(deseasesRepository.findById(deseaseId).get());
        calls.setIsConfirmed(2);
        return callsRepository.save(calls);
    }
}
