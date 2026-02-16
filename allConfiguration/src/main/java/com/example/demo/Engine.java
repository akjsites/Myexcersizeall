package com.example.demo;

import java.util.Hashtable;

import org.springframework.stereotype.Component;
@Component
public class Engine {
   public String EngineeCapacity;
   public Hashtable<String, String> advan;
   public Engine() {}
   public Engine(String engineeCapacity, Hashtable<String, String> advan) {
	super();
	EngineeCapacity = engineeCapacity;
	this.advan = advan;
   }
   public String getEngineeCapacity() {
	return EngineeCapacity;
   }
   public Hashtable<String, String> getAdvan() {
	return advan;
   }
   
}
