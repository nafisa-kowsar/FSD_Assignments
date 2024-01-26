package com.hexaware.MappingsExercise.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room {
	
	@Id
	private int roomId;
	private int occupancy;
	
	public Room() {
	}

	public Room(int roomId, int occupancy) {
		super();
		this.roomId = roomId;
		this.occupancy = occupancy;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	
	
	
	
}
