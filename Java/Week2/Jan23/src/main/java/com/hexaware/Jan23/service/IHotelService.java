package com.hexaware.Jan23.service;

import java.util.List;

import com.hexaware.Jan23.entity.Hotel;

public interface IHotelService {
	
	public boolean insertHotel(Hotel hotel);
	
	public List<Hotel> selectHotelByLocation(String location);
	
	public List<Hotel> selectAllHotels();
	

}
