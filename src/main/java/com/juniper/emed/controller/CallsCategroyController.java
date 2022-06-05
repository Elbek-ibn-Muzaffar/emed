package com.juniper.emed.controller;

import com.juniper.emed.entity.CallsCategory;
import com.juniper.emed.service.CallsCategoryService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/calls-category")
public class CallsCategroyController {
    @Autowired
    private CallsCategoryService callsCategoryService;

    @GetMapping("/get-all")
    public ResponseEntity<List<CallsCategory>> getAllCategory()
    {
        return ResponseEntity.ok(callsCategoryService.getAll());
    }

    @GetMapping("get-one/{id}")
    public ResponseEntity getOneCategory(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok(callsCategoryService.getOne(id));
    }

    @PostMapping("/save")
    public ResponseEntity saveCategory(@RequestBody CallsCategory callsCategory)
    {
        return ResponseEntity.ok(callsCategoryService.save(callsCategory));
    }
}
