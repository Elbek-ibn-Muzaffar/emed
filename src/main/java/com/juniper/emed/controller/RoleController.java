package com.juniper.emed.controller;

import com.juniper.emed.entity.Roles;
import com.juniper.emed.payload.RoleDto;
import com.juniper.emed.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/save")
    public ResponseEntity<Roles> saveRole(RoleDto roleDto)
    {
        ModelMapper modelMapper=new ModelMapper();

        return
        ResponseEntity.ok(roleRepository.save(modelMapper.map(roleDto,Roles.class)));

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Roles>> getAllRoles()
    {
        return ResponseEntity.ok(roleRepository.findAll());
    }
}
