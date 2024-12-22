package com.razu.ResumeBuilder.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String employer;
    private String location;
    private String isRemote;
    private String joiningDate;
    private String endDate;

}
