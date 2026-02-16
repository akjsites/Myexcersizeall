package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class swiy {
    @Autowired
    zomatocontrooler zomato;
    @Autowired
    Environment env;
	
	@GetMapping("/swiy")
	public String getMethodName() {
		String methodName = zomato.getMethodName();
		
		String property = env.getProperty("server.port");
		return "heool"+property;
	}
	
}
