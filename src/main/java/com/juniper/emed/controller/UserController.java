package com.juniper.emed.controller;


import com.juniper.emed.entity.Users;
import com.juniper.emed.payload.UserDto;
import com.juniper.emed.service.UserService;
import com.juniper.emed.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity saveUsers(@RequestBody UserDto userDto)
    {
        return ResponseEntity.ok(userService.saveUser(userDto));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Users>> getAll()
    {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity getUserById(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok(userService.findById(id));
    }
}
