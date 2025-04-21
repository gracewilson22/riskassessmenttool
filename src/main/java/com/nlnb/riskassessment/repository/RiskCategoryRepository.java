package com.nlnb.riskassessment.repository;

import com.nlnb.riskassessment.model.RiskCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RiskCategoryRepository extends JpaRepository<RiskCategory, Long> {}

