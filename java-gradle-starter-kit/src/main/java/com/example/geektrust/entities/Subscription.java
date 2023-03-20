package com.example.geektrust.entities;

public abstract class Subscription {
	
	protected Integer validityInMonth;
	
	protected Integer price;

	public Integer getValidityInMonth() {
		return validityInMonth;
	}

	public void setValidityInMonth(Integer validityInMonth) {
		this.validityInMonth = validityInMonth;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	

}
