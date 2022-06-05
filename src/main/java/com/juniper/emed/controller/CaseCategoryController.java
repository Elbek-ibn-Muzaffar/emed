package com.juniper.emed.controller;

import com.juniper.emed.entity.CaseCategory;
import com.juniper.emed.service.CaseCategoryService;
import com.juniper.emed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/case-category")
public class CaseCategoryController {

    private CaseCategoryService caseCategoryService;

    public CaseCategoryController(CaseCategoryService caseCategoryService) {
        this.caseCategoryService = caseCategoryService;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<CaseCategory>> getAllCategory()
    {
        return ResponseEntity.ok(caseCategoryService.getAll());
    }

    @GetMapping("/get-one/{id}")
    public ResponseEntity getOneCase(@PathVariable("id") Long id)
    {
        return ResponseEntity.ok(caseCategoryService.getOne(id));
    }

    @PostMapping("/save")
    public ResponseEntity saveCaseCategory(@RequestBody CaseCategory caseCategory)
    {
        return ResponseEntity.ok(caseCategoryService.save(caseCategory));
    }
}
