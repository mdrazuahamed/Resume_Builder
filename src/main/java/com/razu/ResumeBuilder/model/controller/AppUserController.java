package com.razu.ResumeBuilder.model.controller;

import com.razu.ResumeBuilder.model.AppUser;
import com.razu.ResumeBuilder.model.Education;
import com.razu.ResumeBuilder.model.repository.AppUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/appUser")
public class AppUserController {
    private AppUserRepository appUserRepository;

    public AppUserController(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    @GetMapping("/basicForm")
    public String basicInfo(Model model) {
        model.addAttribute("blankAppUser", new AppUser());
        return "basic-form";
    }
    @PostMapping("/basicForm")
    public String saveBasicInfo(@ModelAttribute("appUser") AppUser appUser, Model model) {
        appUserRepository.save(appUser);
        List<Education> educations = new ArrayList<>();
        appUser.setEducations(educations);
        model.addAttribute("appUser",appUser);
        return "university-details";
    }
    @PostMapping("/universityDetails")
    public String saveUniversityDetails(@ModelAttribute("educations") AppUser appUser, Model model) {
//        appUserRepository.save(appUser);
//        model.addAttribute("appUser",appUser);
        System.out.println("work");
        System.out.println(appUser.getEducations().size());
        return "university-details";
    }

}
