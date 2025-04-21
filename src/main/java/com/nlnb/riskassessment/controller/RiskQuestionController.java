package com.nlnb.riskassessment.controller;

import com.nlnb.riskassessment.model.RiskQuestion;
import com.nlnb.riskassessment.repository.RiskQuestionRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RiskQuestionController {

    private final RiskQuestionRepository repository;

    public RiskQuestionController(RiskQuestionRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/questions")
    public List<RiskQuestion> getAllQuestions() {
        return repository.findAll();
    }
}

