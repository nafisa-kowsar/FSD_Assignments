package com.hexaware.HotelManagementWithMappings.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	@Id
    private Long ReservationID;
	@ManyToOne
    @JoinColumn(name = "user_id")
    private Long UserID;
	@ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    private Long RoomID;
    private String CheckInDate;
    private String CheckOutDate;
    private int NumberOfAdults;
    private int NumberOfChildren;
    private double TotalAmount;
    private String ReservationStatus;
    
    public Reservation() {
	
	}
	
	public Long getReservationID() {
		return ReservationID;
	}
	public void setReservationID(Long reservationID) {
		ReservationID = reservationID;
	}
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public Long getRoomID() {
		return RoomID;
	}
	public void setRoomID(Long roomID) {
		RoomID = roomID;
	}
	public String getCheckInDate() {
		return CheckInDate;
	}
	public void setCheckInDate(String checkInDate) {
		CheckInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return CheckOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		CheckOutDate = checkOutDate;
	}
	public int getNumberOfAdults() {
		return NumberOfAdults;
	}
	public void setNumberOfAdults(int numberOfAdults) {
		NumberOfAdults = numberOfAdults;
	}
	public int getNumberOfChildren() {
		return NumberOfChildren;
	}
	public void setNumberOfChildren(int numberOfChildren) {
		NumberOfChildren = numberOfChildren;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getReservationStatus() {
		return ReservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		ReservationStatus = reservationStatus;
	}

    
}
