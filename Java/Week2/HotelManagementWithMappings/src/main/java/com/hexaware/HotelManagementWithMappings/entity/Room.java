package com.hexaware.HotelManagementWithMappings.entity;

public class Room {
    private Long RoomID;
    private Long HotelID;
    private String RoomSize;
    private String BedType;
    private int MaxOccupancy;
    private double BaseFare;
    private boolean AC;
    private String AvailabilityStatus;
	public Long getRoomID() {
		return RoomID;
	}
	public void setRoomID(Long roomID) {
		RoomID = roomID;
	}
	public Long getHotelID() {
		return HotelID;
	}
	public void setHotelID(Long hotelID) {
		HotelID = hotelID;
	}
	public String getRoomSize() {
		return RoomSize;
	}
	public void setRoomSize(String roomSize) {
		RoomSize = roomSize;
	}
	public String getBedType() {
		return BedType;
	}
	public void setBedType(String bedType) {
		BedType = bedType;
	}
	public int getMaxOccupancy() {
		return MaxOccupancy;
	}
	public void setMaxOccupancy(int maxOccupancy) {
		MaxOccupancy = maxOccupancy;
	}
	public double getBaseFare() {
		return BaseFare;
	}
	public void setBaseFare(double baseFare) {
		BaseFare = baseFare;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public String getAvailabilityStatus() {
		return AvailabilityStatus;
	}
	public void setAvailabilityStatus(String availabilityStatus) {
		AvailabilityStatus = availabilityStatus;
	}

    
}
