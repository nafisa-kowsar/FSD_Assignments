package com.hexaware.jan24.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;




@Entity
@Table(name = "Hotel_Details")

@NamedQueries(
		{
			@NamedQuery(name="selectHotelByLocation" , query = "select h from Hotel h where h.Location = :location ")
		}
		)
public class Hotel {
	

	@Id
	private Long HotelID;
    private String HotelName;
    private String Location;
    private boolean Dining;
    private boolean Parking;
    
	public Hotel() {
		super();
		
	}

	public Hotel(Long hotelID, String hotelName, String location, boolean dining, boolean parking) {
		super();
		HotelID = hotelID;
		HotelName = hotelName;
		Location = location;
		Dining = dining;
		Parking = parking;
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
