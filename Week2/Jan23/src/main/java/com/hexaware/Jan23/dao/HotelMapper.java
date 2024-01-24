package com.hexaware.Jan23.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.Jan23.entity.Hotel;

public class HotelMapper implements RowMapper<Hotel>{

	@Override
	public Hotel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Hotel hotel = new Hotel();
		
		hotel.setHotelID(rs.getLong("HotelID"));
		hotel.setHotelName(rs.getString("HotelName"));
		hotel.setLocation(rs.getString("Location"));
		hotel.setDining(rs.getBoolean("Dining"));
		hotel.setParking(rs.getBoolean("Parking"));
		
		return hotel;
	}

}
