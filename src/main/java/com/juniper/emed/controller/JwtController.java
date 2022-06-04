package com.juniper.emed.controller;


import com.juniper.emed.payload.AuthRequest;
import com.juniper.emed.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class JwtController {

    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public ResponseEntity generateToken(@RequestBody AuthRequest authRequest) throws Exception
    {
        return ResponseEntity.ok(jwtService.createToken(authRequest));
    }
}
