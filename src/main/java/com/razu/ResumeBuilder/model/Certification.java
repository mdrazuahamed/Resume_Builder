package com.razu.ResumeBuilder.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String certificationName;
    private String issuingOrganization;
    private Date issueDate;
    private Date expiryDate;
}
