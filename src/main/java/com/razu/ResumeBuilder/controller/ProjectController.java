package com.razu.ResumeBuilder.controller;

import com.razu.ResumeBuilder.model.AppUser;
import com.razu.ResumeBuilder.model.Project;
import com.razu.ResumeBuilder.repository.AppUserRepository;
import com.razu.ResumeBuilder.repository.ProjectRepository;
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
@RequestMapping("/project")
public class ProjectController {

    AppUserRepository appUserRepository;
    ProjectRepository projectRepository;

    public ProjectController(AppUserRepository appUserRepository, ProjectRepository projectRepository) {
        this.appUserRepository = appUserRepository;
        this.projectRepository = projectRepository;
    }

    @GetMapping("/projectDetails")
    public String projectDetails(@ModelAttribute("projects") AppUser appUser, Model model) {
        model.addAttribute("appUserForAddProjects", appUser);
        return "add-project-details";
    }

    @PostMapping("/projectDetails")
    public String addExperienceDetails(@ModelAttribute("projects") AppUser appUser, Model model) {
        Optional<AppUser> appUser1 = appUserRepository.findById(appUser.getId());
        List<Project> projects = new ArrayList<>();
        projectRepository.saveAll(appUser.getProjects());
        appUser1.get().setProjects(appUser.getProjects());
        appUserRepository.save(appUser1.get());
        return "success";
    }
}
