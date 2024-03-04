package com.hexaware.MappingsExercise.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Hotel {
	
	@Id
	private int hotelId;
	private String hotelName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hotelOwnerId")
	private HotelOwner hotelOwner;

	public Hotel() {
	
	}

	public Hotel(int hotelId, String hotelName, HotelOwner hotelOwner) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelOwner = hotelOwner;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public HotelOwner getHotelOwner() {
		return hotelOwner;
	}

	public void setHotelOwner(HotelOwner hotelOwner) {
		this.hotelOwner = hotelOwner;
	}
	
	
	
	

}
