package com.durksie.projectmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name= "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectname;
    private String status; //   planned,ongoing, completed

    public Project() {
    }

    public Project(Long id, String status, String projectname) {
        this.id = id;
        this.status = status;
        this.projectname = projectname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectname='" + projectname + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
