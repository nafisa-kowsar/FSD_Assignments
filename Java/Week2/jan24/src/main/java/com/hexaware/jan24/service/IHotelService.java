package com.hexaware.jan24.service;

import java.util.List;

import com.hexaware.jan24.entity.Hotel;

public interface IHotelService {
	
	public boolean insertHotel(Hotel hotel);
	public boolean updateHotel(Hotel hotel);
	
	public List<Hotel> selectHotelByLocation(String location);
	public boolean deleteHotelByName(String name);
	
	public List<Hotel> selectAllHotels();

}
