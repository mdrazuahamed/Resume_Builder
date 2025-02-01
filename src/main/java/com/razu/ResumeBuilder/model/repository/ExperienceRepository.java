package com.razu.ResumeBuilder.model.repository;

import com.razu.ResumeBuilder.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
