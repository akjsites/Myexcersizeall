package com.example.demo;

import com.example.demo.Project;
import com.example.demo.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // Insert project automatically on startup
    @Bean
    CommandLineRunner runner(ProjectRepository repo) {
        return args -> {
            Project p = new Project("Permanent Project");
            repo.save(p);
            System.out.println("Inserted permanently: " + p.getName());
        };
    }
}
