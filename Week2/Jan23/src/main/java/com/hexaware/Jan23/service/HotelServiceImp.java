package com.hexaware.Jan23.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.Jan23.dao.IHotelDao;
import com.hexaware.Jan23.entity.Hotel;

@Service
public class HotelServiceImp implements IHotelService{
	
	@Autowired
	IHotelDao dao;

	@Override
	public boolean insertHotel(Hotel hotel) {
	
		return dao.insertHotel(hotel);
	}

	@Override
	public List<Hotel> selectHotelByLocation(String location) {
		return dao.selectHotelByLocation(location);
	}

	@Override
	public List<Hotel> selectAllHotels() {
		return dao.selectAllHotels();
	}
	
	
	
	

}
