package com.hexaware.HotelManagementWithMappings.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

public class HotelOwner {
	
	@Id
    private Long OwnerID;
    private String UserName;
    private String FirstName;
    private String LastName;
    private String Password;
    private String Email;
    
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private List<Hotel> hotels;
    
	public Long getOwnerID() {
		return OwnerID;
	}
	public void setOwnerID(Long ownerID) {
		OwnerID = ownerID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	

   
}
