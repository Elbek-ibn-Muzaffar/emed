package com.juniper.emed.controller;


import com.juniper.emed.payload.UserDto;
import com.juniper.emed.service.UserService;
import com.juniper.emed.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity saveUsers(@RequestBody UserDto userDto)
    {
        return ResponseEntity.ok(userService.saveUser(userDto));
    }
}
