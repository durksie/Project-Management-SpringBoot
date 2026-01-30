package com.durksie.projectmanagement.repo;

import com.durksie.projectmanagement.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProjectRepo extends JpaRepository<Project,Long> {
}
