package com.example.demo;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class product {
	public product() {}
	private String bookId;

	private String title;

	private String author;

	private String category;
    
	private int availableStatus;
	
	private LocalDate releseDate;
	
	

	public product(String bookId, String title, String author, String category, int availableStatus, LocalDate releseDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.availableStatus = availableStatus;
		this.releseDate = releseDate;
	}

	

	public String getBookId() {
		return bookId;
	}



	public void setBookId(String bookId) {
		this.bookId = bookId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public int getAvailableStatus() {
		return availableStatus;
	}



	public void setAvailableStatus(int availableStatus) {
		this.availableStatus = availableStatus;
	}



	public LocalDate getReleseDate() {
		return releseDate;
	}



	public void setReleseDate(LocalDate releseDate) {
		this.releseDate = releseDate;
	}



	@Override
	public String toString() {
		return "product [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", availableStatus=" + availableStatus + ", releseDate=" + releseDate + "]";
	}



	
	

}
