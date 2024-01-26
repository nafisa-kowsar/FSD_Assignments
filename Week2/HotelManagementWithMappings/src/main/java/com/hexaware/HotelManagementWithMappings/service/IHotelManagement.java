package com.hexaware.HotelManagementWithMappings.service;

import java.util.List;

import com.hexaware.HotelManagementWithMappings.entity.Hotel;
import com.hexaware.HotelManagementWithMappings.entity.Reservation;
import com.hexaware.HotelManagementWithMappings.entity.Review;
import com.hexaware.HotelManagementWithMappings.entity.Room;
import com.hexaware.HotelManagementWithMappings.entity.User;
import com.hexaware.HotelManagementWithMappings.entity.UserRole;

public interface IHotelManagement {
	
	boolean createUser(User user);

    boolean updateUser(User user);

    boolean deleteUserById(Long userId);

    User getUserById(Long userId);

    User getUserByUsername(String username);

    List<User> getAllUsers();

    
    boolean createHotel(Hotel hotel);

    boolean updateHotel(Hotel hotel);

    boolean deleteHotelById(Long hotelId);

    Hotel getHotelById(Long hotelId);

    List<Hotel> getAllHotels();

   
    boolean createRoom(Room room);

    boolean updateRoom(Room room);

    boolean deleteRoomById(Long roomId);

    Room getRoomById(Long roomId);

    List<Room> getAllRooms();

    
    boolean createReservation(Reservation reservation);

    boolean updateReservation(Reservation reservation);

    boolean deleteReservationById(Long reservationId);

    Reservation getReservationById(Long reservationId);

    List<Reservation> getAllReservations();

    
    boolean createReview(Review review);

    boolean updateReview(Review review);

    boolean deleteReviewById(Long reviewId);

    Review getReviewById(Long reviewId);

    List<Review> getAllReviews();

    
    boolean createUserRole(UserRole userRole);

    boolean updateUserRole(UserRole userRole);

    boolean deleteUserRoleById(Long userRoleId);

    UserRole getUserRoleById(Long userRoleId);

    List<UserRole> getAllUserRoles();
}


