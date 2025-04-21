package com.nlnb.riskassessment.repository; // Repository's package

import com.nlnb.riskassessment.model.RiskQuestion; // ← Must match the model's package
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskQuestionRepository extends JpaRepository<RiskQuestion, Long> {}



