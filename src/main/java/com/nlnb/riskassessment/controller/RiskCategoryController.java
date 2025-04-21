package com.nlnb.riskassessment.controller;

import com.nlnb.riskassessment.model.RiskCategory;
import com.nlnb.riskassessment.repository.RiskCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class RiskCategoryController {
    @Autowired
    private RiskCategoryRepository repository;

    @GetMapping
    public List<RiskCategory> getAll() {
        return repository.findAll();
    }
}

