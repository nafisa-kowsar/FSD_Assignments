package com.hexaware.finaldemo.service;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.hexaware.finaldemo.entity.HotelOwner;
import com.hexaware.finaldemo.entity.Reservation;
import com.hexaware.finaldemo.entity.Room;
import com.hexaware.finaldemo.entity.User;

public interface IUserService {
      public User getUserById(int userId);
      public boolean deleteUserById(int userId);
      public boolean updateUserById(int userId);
      public Set<HotelOwner> getAllHotels ();
      public HotelOwner getHotelById (int hotelId);
      public Set<Room> getAllRoomByHotelId(int hotelId);
      public Reservation makeReservation(int hotelId,Room room,Date checkInDate,Date checkOutDate,int numberOfAdults,int numberOfChildren,double totalAmount);
      public boolean updateReservationById(int reservationId,Room room,Date checkInDate,Date checkOutDate,int numberOfAdults,int numberOfChildren,double totalAmount );
      public boolean deleteReservationById(int reservationId);
      public boolean giveReview(int hotelId,int rating,String reviewText,Date reviewDate);
      public double calculateReservationFare(List<String> roomSize, LocalDate checkInDate, LocalDate checkOutDate);
    
}