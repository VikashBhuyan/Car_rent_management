package com.vikash;

public class CarOwner {
	private String ownerName;
	private String contactNo;
	public CarOwner(String ownerName, String contactNo) {
		super();
		this.ownerName = ownerName;
		this.contactNo = contactNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "CarOwner [ownerName=" + ownerName + ", contactNo=" + contactNo + "]";
	}
	
	
}
