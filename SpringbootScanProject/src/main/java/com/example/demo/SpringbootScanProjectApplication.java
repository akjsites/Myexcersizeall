package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import akj.example.example1;

@SpringBootApplication
//@ComponentScan(basePackages = {"akj.example","com.example.demo"})
public class SpringbootScanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootScanProjectApplication.class, args);
	}

	@Bean
	public example1 getexample()
	{
		return new example1();
	}
}
