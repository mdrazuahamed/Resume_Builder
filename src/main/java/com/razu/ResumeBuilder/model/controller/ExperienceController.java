package com.razu.ResumeBuilder.model.controller;

import com.razu.ResumeBuilder.model.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/experience")
public class ExperienceController {
    @GetMapping("/experienceDetails")
    public String experienceDetails(@ModelAttribute("educations") AppUser appUser, Model model) {
        model.addAttribute("appUserForAddExperience", appUser);
        System.out.println(appUser.getId());
        return "add-experience-details";
    }
}
