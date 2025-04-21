package com.nlnb.riskassessment.model;

import jakarta.persistence.*;

@Entity
public class RiskCategory {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Getters and Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

