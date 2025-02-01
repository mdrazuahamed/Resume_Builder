package com.razu.ResumeBuilder.model.controller;

import com.razu.ResumeBuilder.model.AppUser;
import com.razu.ResumeBuilder.model.Experience;
import com.razu.ResumeBuilder.model.repository.AppUserRepository;
import com.razu.ResumeBuilder.model.repository.ExperienceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/experience")
public class ExperienceController {

    AppUserRepository appUserRepository;
    ExperienceRepository experienceRepository;

    public ExperienceController(AppUserRepository appUserRepository, ExperienceRepository experienceRepository) {
        this.appUserRepository = appUserRepository;
        this.experienceRepository = experienceRepository;
    }

    @GetMapping("/experienceDetails")
    public String experienceDetails(@ModelAttribute("educations") AppUser appUser, Model model) {
        model.addAttribute("appUserForAddExperience", appUser);
        return "add-experience-details";
    }
    @PostMapping("/experienceDetails")
    public String addExperienceDetails(@ModelAttribute("educations") AppUser appUser, Model model) {
        Optional<AppUser> appUser1 = appUserRepository.findById(appUser.getId());
        List<Experience> experiences = new ArrayList<>();
        experienceRepository.saveAll(appUser.getExperiences());
        appUser1.get().setExperiences(appUser.getExperiences());
        appUserRepository.save(appUser1.get());

        return "success";
    }
}
