package com.example.practice.com.example.practice.setterInjection$Field;

public class manager {        
      String name;
      String id;
      float sal;
	  public manager(String name, String id, float sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	  }
	  @Override
	  public String toString() {
		return "manager [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	  }
      
}
