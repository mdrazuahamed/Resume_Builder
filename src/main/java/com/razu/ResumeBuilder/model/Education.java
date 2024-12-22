package com.razu.ResumeBuilder.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String institutionName;
    private String degree;
    private String institutionLocation;
    private String fieldOfStudy;
    private String gpa;
}
