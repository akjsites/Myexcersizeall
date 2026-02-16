package com.example.demo;

public class Bus {
    public String Name;
    public String Id;
    public Bus() {}
	public Bus(String name, String id) {
		super();
		Name = name;
		Id = id;
	}
	@Override
	public String toString() {
		return "Bus [Name=" + Name + ", Id=" + Id + "]";
	}
	
    
}
