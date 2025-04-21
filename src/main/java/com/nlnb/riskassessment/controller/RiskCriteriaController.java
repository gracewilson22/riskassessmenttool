package com.nlnb.riskassessment.controller;

import com.nlnb.riskassessment.model.RiskCriteria;
import com.nlnb.riskassessment.repository.RiskCriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/criteria")
public class RiskCriteriaController {
    @Autowired
    private RiskCriteriaRepository repository;

    @GetMapping
    public List<RiskCriteria> getAll() {
        return repository.findAll();
    }
}

