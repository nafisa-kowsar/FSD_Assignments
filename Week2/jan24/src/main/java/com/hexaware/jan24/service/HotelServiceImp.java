package com.hexaware.jan24.service;

import java.util.List;

import com.hexaware.jan24.dao.HotelDaoImp;
import com.hexaware.jan24.dao.IHotelDao;
import com.hexaware.jan24.entity.Hotel;

public class HotelServiceImp implements IHotelService{
	
	IHotelDao dao = new HotelDaoImp();

	@Override
	public boolean insertHotel(Hotel hotel) {
		
		return dao.insertHotel(hotel);
	}

	@Override
	public boolean updateHotel(Hotel hotel) {
		
		return dao.updateHotel(hotel);
	}

	@Override
	public List<Hotel> selectHotelByLocation(String location) {
		
		return dao.selectHotelByLocation(location);
	}

	@Override
	public boolean deleteHotelByName(String name) {
		
		return dao.deleteHotelByName(name);
	}

	@Override
	public List<Hotel> selectAllHotels() {
		
		return dao.selectAllHotels();
	}

}
