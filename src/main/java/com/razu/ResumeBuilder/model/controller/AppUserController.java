package com.razu.ResumeBuilder.model.controller;

import com.razu.ResumeBuilder.model.AppUser;
import com.razu.ResumeBuilder.model.Education;
import com.razu.ResumeBuilder.model.repository.AppUserRepository;
import com.razu.ResumeBuilder.model.repository.EducationRepository;
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
@RequestMapping("/appUser")
public class AppUserController {
    private AppUserRepository appUserRepository;
    private EducationRepository educationRepository;

    public AppUserController(AppUserRepository appUserRepository, EducationRepository educationRepository) {
        this.appUserRepository = appUserRepository;
        this.educationRepository = educationRepository;
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
        model.addAttribute("appUserId",appUser.getId());
        return "university-details";
    }
    @PostMapping("/universityDetails")
    public String saveUniversityDetails(@ModelAttribute("educations") AppUser appUser, Model model) {
        Optional<AppUser> optionalAppUser = appUserRepository.findById(appUser.getId());
        if(optionalAppUser.isEmpty())
            System.out.println("No appuser found");
        List<Education> educations = new ArrayList<>();
        appUser.getEducations().forEach(existEducation -> {
            Education newEducation = new Education();
            newEducation.setDegree(existEducation.getDegree());
            newEducation.setFieldOfStudy(existEducation.getFieldOfStudy());
            newEducation.setGpa(existEducation.getGpa());
            newEducation.setInstitutionName(existEducation.getInstitutionName());
            newEducation.setInstitutionLocation(existEducation.getInstitutionLocation());
            educationRepository.save(newEducation);
            educations.add(newEducation);
        });
        optionalAppUser.get().setEducations(educations);
        appUserRepository.save(optionalAppUser.get());
        return "success";
    }

}
