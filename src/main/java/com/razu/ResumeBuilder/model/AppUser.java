package com.razu.ResumeBuilder.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "First Name is require")
    private String firstName;
    @NotBlank(message = "Sur Name is require")
    private String surName;
    private String city;
    @NotBlank(message = "Postal Code is require")
    private String postalCode;
    @NotBlank(message = "Country is require")
    private String country;
    private String phone;
    private String email;
    private String summery;
    @OneToOne(cascade = CascadeType.ALL)
    private Education hscEducation;
    @OneToOne(cascade = CascadeType.ALL)
    private Education sscEducation;
    @OneToOne(cascade = CascadeType.ALL)
    private Education bscEducation;


    public AppUser(String firstName, String surName, String city, String postalCode, String country, String phone, String email) {
        this.firstName = firstName;
        this.surName = surName;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }

    public AppUser() {

    }

    public Education getHscEducation() {
        return hscEducation;
    }

    public void setHscEducation(Education hscEducation) {
        this.hscEducation = hscEducation;
    }

    public Education getSscEducation() {
        return sscEducation;
    }

    public void setSscEducation(Education sscEducation) {
        this.sscEducation = sscEducation;
    }

    public Education getBscEducation() {
        return bscEducation;
    }

    public void setBscEducation(Education bscEducation) {
        this.bscEducation = bscEducation;
    }

    public String getSummery() {
        return summery;
    }

    public void setSummery(String summery) {
        this.summery = summery;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
