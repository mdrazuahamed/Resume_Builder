package com.razu.ResumeBuilder.repository;

import com.razu.ResumeBuilder.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
}
