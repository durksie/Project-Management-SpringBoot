package com.durksie.projectmanagement.service;

import com.durksie.projectmanagement.model.Project;
import com.durksie.projectmanagement.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
//To be able to use the repository here
    private final ProjectRepo projectRepo;
    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }
//to create the ptoject
    public Project createProject(Project project){
        return projectRepo.save(project);
    }
    //to get all the projects
    public List<Project> getAllProjects(){
        return projectRepo.findAll();
    }

    public Project getProjectById(Long id){
        return projectRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Project not found"));
    }

    public Project updateProject(Project project){
        return  projectRepo.save(project);
    }

    public void deleteProject(Long id){
        projectRepo.deleteById(id);
    }








}
