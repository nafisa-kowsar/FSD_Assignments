package com.hexaware.Jan23.entity;

import org.springframework.stereotype.Component;

@Component

public class Hotel {
	
	private Long HotelID;
    private String HotelName;
    private String Location;
    private boolean Dining;
    private boolean Parking;
    
	public Hotel() {
	}

	public Long getHotelID() {
		return HotelID;
	}

	public void setHotelID(Long hotelID) {
		HotelID = hotelID;
	}

	public String getHotelName() {
		return HotelName;
	}

	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public boolean isDining() {
		return Dining;
	}

	public void setDining(boolean dining) {
		Dining = dining;
	}

	public boolean isParking() {
		return Parking;
	}

	public void setParking(boolean parking) {
		Parking = parking;
	}

	@Override
	public String toString() {
		return "Hotel [HotelID=" + HotelID + ", HotelName=" + HotelName + ", Location=" + Location + ", Dining="
				+ Dining + ", Parking=" + Parking + "]";
	}
    
    

}
