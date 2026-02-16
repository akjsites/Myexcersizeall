package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class controler {
	@Autowired
	service service;

	public void transfer(long from, long to, double bal) {
		service.transfer(from, to, bal);
	}
}
