package com.aswini.JdbcTamplate;

import org.springframework.stereotype.Component;

@Component
public class employees {
     String id;
     String name;
     String adress;
     
	 public employees() {
		super();
	}
	 public employees(String id, String name, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	 public String getId() {
		 return id;
	 }
	 public void setId(String id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getAdress() {
		 return adress;
	 }
	 public void setAdress(String adress) {
		 this.adress = adress;
	 }
     
}
