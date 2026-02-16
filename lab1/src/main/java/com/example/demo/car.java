package com.example.demo;

import java.time.LocalDate;

public class car {
	   private String carName;
	   private int CarId;
	   private String mdate;
	   private LocalDate date;
	   public car(String carName, int carId, String mdate, LocalDate date) {
		super();
		this.carName = carName;
		CarId = carId;
		this.mdate = mdate;
		this.date = date;
	   }
	   public String getCarName() {
		   return carName;
	   }
	   public int getCarId() {
		   return CarId;
	   }
	   public String getMdate() {
		   return mdate;
	   }
	   public LocalDate getDate() {
		   return date;
	   }
	   
	   
}
