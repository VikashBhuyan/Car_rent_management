	package com.vikash;

import java.time.LocalDate;
import java.util.Date;

public class Booking {
	private Car car;
    private Date startDate;
    private Date endDate;
    private Customer customer;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Booking(Car car, Date startDate, Date endDate, Customer customer) {
		super();
		this.car = car;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customer = customer;
	}
	
}
