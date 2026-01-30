package com.durksie.projectmanagement.controller;

import com.durksie.projectmanagement.model.Project;
import com.durksie.projectmanagement.service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    //To create the project
    @PostMapping("add")
    public Project create(@RequestBody Project project){
        return projectService.createProject(project);
    }
    //To read all projects
    @GetMapping("all")
    public List<Project> getAll(){
        return projectService.getAllProjects();
    }
    //To read one
    @GetMapping("find/{id}")
    public Project getById(@PathVariable Long id){
        return  projectService.getProjectById(id);
    }

    //To update
    @PutMapping("update/{id}")
    public Project update(@RequestBody Project project){
       return projectService.updateProject(project);
    }

    //To delete
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        projectService.deleteProject(id);
        return "project deleted successfully";
    }


}
