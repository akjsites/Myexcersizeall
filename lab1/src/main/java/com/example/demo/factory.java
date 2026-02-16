package com.example.demo;

import java.time.LocalDate;

public class factory {
   private String factoryName;
   private car car;
   


   public factory(String factoryName, car car) {
	super();
	this.factoryName = factoryName;
	this.car = car;
}


   @Override
   public String toString() {
	return "factory [carName=" + car.getCarName() + ", CarId=" +car.getCarId()  + ", mdate=" + car.getMdate() + ", date=" + car.getDate() + "factoryName=" + factoryName+"]";
   }   
   
   
}
