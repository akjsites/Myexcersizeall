package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class student {
   private String name;
   private String phno;
   @Autowired
   @Qualifier("getadress")
   private adress a;
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public String getPhno() {
	return phno;
   }
   public void setPhno(String phno) {
	this.phno = phno;
   }
   public adress getA() {
	return a;
   }
   public void setA(adress a) {
	this.a = a;
   }
   @Override
   public String toString() {
	return "student [name=" + name + ", phno=" + phno + ", a=" + a + "]";
   }
   
}
