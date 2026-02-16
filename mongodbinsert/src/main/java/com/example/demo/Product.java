package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "akj")
public class Product {

	private String bookId;

	public Product() {
	}

	public Product(String bookId) {
		this.bookId = bookId;
	}

}
