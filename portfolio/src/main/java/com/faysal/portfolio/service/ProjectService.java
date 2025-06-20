package com.faysal.portfolio.service;

import com.faysal.portfolio.model.Project;
import com.faysal.portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo) {
        this.repo = repo;
    }

    public List<Project> all() {
        return repo.findAll();
    }
}
