package com.razu.ResumeBuilder.repository;

import com.razu.ResumeBuilder.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
