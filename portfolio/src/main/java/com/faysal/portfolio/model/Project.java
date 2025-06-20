package com.faysal.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String technologies;
    private String repoUrl;
    private String liveUrl;

    public Project() {
    }

    public Project(Long id, String title, String description, String technologies, String repoUrl, String liveUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.repoUrl = repoUrl;
        this.liveUrl = liveUrl;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public String getLiveUrl() {
        return liveUrl;
    }
}
