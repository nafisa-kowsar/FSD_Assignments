package com.hexaware.MappingsExercise.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class HotelOM {
	
	@Id
	private int hotelId;
	private String hotelName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="hotelId")
	private Set<Room> rooms = new HashSet<Room>();

	public HotelOM() {
	
	}

	public HotelOM(int hotelId, String hotelName, Set<Room> rooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.rooms = rooms;
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

	public Set<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}
	
	public void addRoom(Room room) {
		
		Set<Room> set = getRooms();
		set.add(room);
		
	}
	
	
	

}
