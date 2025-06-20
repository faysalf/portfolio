package com.faysal.portfolio.controller;

import com.faysal.portfolio.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    private final ProjectService service;

    public PageController(ProjectService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() { return "home"; }

    @GetMapping("/about")
    public String about() { return "about"; }

    @GetMapping("/photos")
    public String photos() { return "photos"; }

    @GetMapping("/contact")
    public String contact() { return "contact"; }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", service.all());
        return "projects";
    }
}
