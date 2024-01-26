package com.hexaware.MappingsExercise.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HotelOwner {
	
	@Id
	private int ownerId;
	private String ownerName;
	
	public HotelOwner() {
	
	}

	public HotelOwner(int ownerId, String ownerName) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	
	
	

}
