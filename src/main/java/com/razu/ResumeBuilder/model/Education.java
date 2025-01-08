package com.razu.ResumeBuilder.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String institutionName;
    private String degree;
    private String institutionLocation;
    private String fieldOfStudy;
    private String gpa;

    public Education(Long id, String institutionName, String degree, String institutionLocation, String fieldOfStudy, String gpa) {
        this.id = id;
        this.institutionName = institutionName;
        this.degree = degree;
        this.institutionLocation = institutionLocation;
        this.fieldOfStudy = fieldOfStudy;
        this.gpa = gpa;
    }

    public Education() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getInstitutionLocation() {
        return institutionLocation;
    }

    public void setInstitutionLocation(String institutionLocation) {
        this.institutionLocation = institutionLocation;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", institutionName='" + institutionName + '\'' +
                ", degree='" + degree + '\'' +
                ", institutionLocation='" + institutionLocation + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gpa='" + gpa + '\'' +
                '}';
    }
}
