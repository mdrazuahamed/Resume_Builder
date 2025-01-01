package com.razu.ResumeBuilder.model.controller;

import com.razu.ResumeBuilder.model.AppUser;
import com.razu.ResumeBuilder.model.repository.AppUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
