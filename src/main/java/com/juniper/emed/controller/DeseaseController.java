package com.juniper.emed.controller;

import com.juniper.emed.entity.Deseases;
import com.juniper.emed.payload.DeseaseDto;
import com.juniper.emed.service.DeseasesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/deseases")
public class DeseaseController {

    @Autowired
    private DeseasesService deseasesService;

    @GetMapping("/get-all")
    public ResponseEntity<List<Deseases>> getAll()
    {
        return ResponseEntity.ok(deseasesService.getAll());
    }

    @GetMapping("/get-one/{id}")
    public ResponseEntity getOne(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok(deseasesService.getOne(id));
    }

    @GetMapping("/get-by-category/{id}")
    public ResponseEntity<List<Deseases>> getByCategory(@PathVariable("id") Long categoryId)
    {
        return ResponseEntity.ok(deseasesService.getByCategoryId(categoryId));
    }

    @PostMapping("/save")
    public ResponseEntity saveDesease(@RequestBody DeseaseDto deseases)
    {

        return ResponseEntity.ok(deseasesService.save(deseases));
    }

    @DeleteMapping("/delete-all")
    public ResponseEntity deleteAllDeseases()
    {
        return ResponseEntity.ok(deseasesService.deleteAll());
    }
}
