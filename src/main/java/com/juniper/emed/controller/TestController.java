package com.juniper.emed.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/admin/test")
    public ResponseEntity testing()
    {
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/customer/test")
    public ResponseEntity testing2()
    {
        return ResponseEntity.ok("Hello customer");
    }

}
