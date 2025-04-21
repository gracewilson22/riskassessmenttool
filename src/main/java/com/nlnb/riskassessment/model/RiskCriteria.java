package com.nlnb.riskassessment.model;

import jakarta.persistence.*;

@Entity
public class RiskCriteria {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private RiskCategory category;

    private String name;

    // Getters and Setters
    public Long getId() { return id; }
    public RiskCategory getCategory() { return category; }
    public String getName() { return name; }
    public void setCategory(RiskCategory category) { this.category = category; }
    public void setName(String name) { this.name = name; }
}
