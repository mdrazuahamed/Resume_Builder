package com.razu.ResumeBuilder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
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

    public Experience(Long id) {
        this.id = id;
    }

    public Experience() {
    }

    public Experience(Long id, String jobTitle, String employer, String location, String isRemote, String joiningDate, String endDate) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.employer = employer;
        this.location = location;
        this.isRemote = isRemote;
        this.joiningDate = joiningDate;
        this.endDate = endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIsRemote() {
        return isRemote;
    }

    public void setIsRemote(String isRemote) {
        this.isRemote = isRemote;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
