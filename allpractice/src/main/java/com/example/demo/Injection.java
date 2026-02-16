package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Injection {
   private String name;

   public Injection(String name) {
	super();
	this.name = name;
   }
   

   public String getName() {
	return name;
}


   public void setName(String name) {
	this.name = name;
   }


   public Injection() {
	super();
   }
   @Override
	public String toString() {
		return ""+this.name;
	}
   
}
