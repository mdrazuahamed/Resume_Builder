package com.razu.ResumeBuilder.repository;

import com.razu.ResumeBuilder.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
}
