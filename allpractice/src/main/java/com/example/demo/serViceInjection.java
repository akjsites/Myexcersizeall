package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class serViceInjection {
   @Autowired
   Injection i;
   public void display()
   {
	   System.out.println("Hello  I am");
   }
}
