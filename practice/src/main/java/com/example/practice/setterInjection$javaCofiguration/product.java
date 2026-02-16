package com.example.practice.setterInjection$javaCofiguration;

public class product {

	String name;
	String id;
	float price;
	
	public product(String name, String id, float price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}
	
}
