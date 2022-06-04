package com.juniper.emed.controller;


import com.juniper.emed.payload.RoleDto;
import com.juniper.emed.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/saveRole")
    public ResponseEntity saveRoles(@RequestBody RoleDto roleDto)
    {
        return ResponseEntity.ok(roleService.saveRole(roleDto));
    }
}
