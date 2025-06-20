package com.faysal.portfolio;

import com.faysal.portfolio.model.Project;
import com.faysal.portfolio.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProjectRepository repo;

    public DataSeeder(ProjectRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {
        if (repo.count() == 0) {
            repo.save(new Project(
                    null,
                    "Reserveit BD",
                    "(A booking platform across the Bangladesh.)",
                    "Swift, UIKit, Combine, and SwiftUI.",
                    "https://apps.apple.com/us/app/reserveit-bd/id6463799781",
                    "https://apps.apple.com/us/app/reserveit-bd/id6463799781"
            ));

            repo.save(new Project(
                    null,
                    "FlexiJob",
                    "(A recruitment platform based in Australia)",
                    "Swift, UIKit, and RxSwift",
                    "https://apps.apple.com/us/app/flexijob/id6484069091",
                    "https://apps.apple.com/us/app/flexijob/id6484069091"
            ));

            repo.save(new Project(
                    null,
                    "FaceClass AI",
                    "(Smart class attendence system in Korea.)",
                    "Swift, UIKit, and Combine.",
                    "",
                    ""
            ));

            repo.save(new Project(
                    null,
                    "Gif Maker",
                    "(Entertainment Application)",
                    "Swift, UIKit, Storyboard",
                    "",
                    ""
            ));

            repo.save(new Project(
                    null,
                    "GenAI - AI Chat",
                    "(Chatbot application, powered by OpenAI)",
                    "Swift, UIKit, Storyboard",
                    "",
                    ""
            ));

        }
    }
}
