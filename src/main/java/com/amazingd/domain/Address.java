package com.amazingd.domain;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String street;
	private String country;
	private String provincy;

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvincy() {
		return provincy;
	}
	public void setProvincy(String provincy) {
		this.provincy = provincy;
	}

	
}
