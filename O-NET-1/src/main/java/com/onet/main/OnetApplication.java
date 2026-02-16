package com.onet.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com") // scan everything under com.onet
@EnableJpaRepositories("com.onet.repository")        // correct spelling
@EntityScan("com.onet.entity")
public class OnetApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnetApplication.class, args);
    }
}
