package com.hexaware.HotelManagementWithMappings.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hotel {
	
	@Id
    private Long HotelID;
    private String HotelName;
    private String Location;
    private boolean Dining;
    private boolean Parking;
    private boolean FreeWiFi;
    private boolean RoomService;
    private boolean SwimmingPool;
    private boolean FitnessCenter;
    
    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

    @OneToMany(mappedBy = "hotel")
    private List<Review> reviews;

    @ManyToOne
    @JoinColumn(name = "ownerId")  
    private HotelOwner owner;
    
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
	public boolean isFreeWiFi() {
		return FreeWiFi;
	}
	public void setFreeWiFi(boolean freeWiFi) {
		FreeWiFi = freeWiFi;
	}
	public boolean isRoomService() {
		return RoomService;
	}
	public void setRoomService(boolean roomService) {
		RoomService = roomService;
	}
	public boolean isSwimmingPool() {
		return SwimmingPool;
	}
	public void setSwimmingPool(boolean swimmingPool) {
		SwimmingPool = swimmingPool;
	}
	public boolean isFitnessCenter() {
		return FitnessCenter;
	}
	public void setFitnessCenter(boolean fitnessCenter) {
		FitnessCenter = fitnessCenter;
	
	}
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	public HotelOwner getOwner() {
		return owner;
	}
	public void setOwner(HotelOwner owner) {
		this.owner = owner;
	}
	

    
}
