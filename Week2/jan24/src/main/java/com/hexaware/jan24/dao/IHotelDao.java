package com.hexaware.jan24.dao;

import java.util.List;

import com.hexaware.jan24.entity.Hotel;

public interface IHotelDao {
	public boolean insertHotel(Hotel hotel);
	public boolean updateHotel(Hotel hotel);
	
	public List<Hotel> selectHotelByLocation(String location);
	public boolean deleteHotelByName(String name);
	
	public List<Hotel> selectAllHotels();

}
