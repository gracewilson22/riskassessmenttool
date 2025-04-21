package com.nlnb.riskassessment.model;

import jakarta.persistence.*;

@Entity
public class RiskQuestion {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "criteria_id")
    private RiskCriteria criteria;

    private String text;

    // Getters and Setters
    public Long getId() { return id; }
    public RiskCriteria getCriteria() { return criteria; }
    public String getText() { return text; }
    public void setCriteria(RiskCriteria criteria) { this.criteria = criteria; }
    public void setText(String text) { this.text = text; }
}


