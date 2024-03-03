package com.vikash;

public class Car {
	private String carNumberPlate;
	private String carName;
	private int carMilage;
	private int rentPerHour;
	public Car(String carNumberPlate, String carName, int carMilage, int rentPerHour) {
		super();
		this.carNumberPlate = carNumberPlate;
		this.carName = carName;
		this.carMilage = carMilage;
//		this.carOwner = carOwner;
		this.rentPerHour = rentPerHour;
	}
	public Car() {
		
	}
	public String getCarNumberPlate() {
		return carNumberPlate;
	}
	public void setCarNumberPlate(String carNumberPlate) {
		this.carNumberPlate = carNumberPlate;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarMilage() {
		return carMilage;
	}
	public void setCarMilage(int carMilage) {
		this.carMilage = carMilage;
	}
//	public CarOwner getCarOwner() {
//		return carOwner;
//	}
//	public void setCarOwner(CarOwner carOwner) {
//		this.carOwner = carOwner;
//	}
	public int getRentPerHour() {
		return rentPerHour;
	}
	public void setRentPerHour(int rentPerHour) {
		this.rentPerHour = rentPerHour;
	}
	
	
}
