package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "zomato")
public interface zomatocontrooler  {

	@GetMapping("/zomato")
	public String getMethodName();
}
