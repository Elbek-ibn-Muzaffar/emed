package com.juniper.emed.service;


import com.juniper.emed.entity.Roles;
import com.juniper.emed.payload.RoleDto;
import com.juniper.emed.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    ModelMapper modelMapper=new ModelMapper();

    public String saveRole(RoleDto roleDto)
    {
        roleRepository.save(modelMapper.map(roleDto, Roles.class));
        return "Saqlandi";
    }
}
