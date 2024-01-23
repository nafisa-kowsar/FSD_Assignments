package com.hexaware.springannotations.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Address {
	private String hno;
	private String city;
	private String country;
	
	
	public Address() {
	}
	
	
	public Address(String hno, String city, String country) {
		super();
		this.hno = hno;
		this.city = city;
		this.country = country;
	}


	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
	
	