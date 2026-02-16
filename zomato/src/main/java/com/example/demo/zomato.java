package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class zomato {
    
	@Autowired
    Environment env;
	
	@GetMapping("/zomato")
	public String getMethodName() {
		String property = env.getProperty("server.port");
		return "heool"+property;
	}
	
}
