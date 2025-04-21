package com.nlnb.riskassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class RiskAssessmentApplication {
	public static void main(String[] args) {
		SpringApplication.run(RiskAssessmentApplication.class, args);
	}

	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Welcome to Risk Assessment!";
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello from Spring Boot!";
	}

	@GetMapping("/form")
	public String showForm() {
		return "risk-form"; // ← Must match template filename
	}

	@PostMapping("/assess")
	public String handleSubmission(@RequestParam String riskDescription) {
		System.out.println("Risk submitted: " + riskDescription);
		return "redirect:/form";
	}

}
