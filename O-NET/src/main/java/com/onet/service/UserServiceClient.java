package com.onet.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserServiceClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public String getUserById(Long userId) {
        return restTemplate.getForObject(
            "http://USER-SERVICE/api/users/" + userId,
            String.class
        );
    }
}
