package com.hexaware.Jan23.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.Jan23.entity.Hotel;


@Repository
public class HotelDaoImp implements IHotelDao{
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public HotelDaoImp(DataSource datasource) {
		
		jdbcTemplate = new JdbcTemplate(datasource);
		System.out.println(jdbcTemplate);
	}

	@Override
	public boolean insertHotel(Hotel hotel) {
		
		String insertQuery = "INSERT INTO Hotel( HotelID, HotelName, Location, Dining, Parking) VALUES(?,?,?,?,?)";
		int count = jdbcTemplate.update(insertQuery,hotel.getHotelID(), hotel.getHotelName(), hotel.getLocation(), hotel.isDining(), hotel.isParking());
		return count>0;
	
	}

	@Override
	public List<Hotel> selectHotelByLocation(String location) {
		String selectHotelByLocationQuery = "SELECT HotelID, HotelName, Location, Dining, Parking FROM Hotel WHERE Location = ?";
		List<Hotel> list = jdbcTemplate.query(selectHotelByLocationQuery, new HotelMapper(),location);
		return list;
		
	}

	@Override
	public List<Hotel> selectAllHotels() {
		
		String selectAllQuery = "SELECT HotelID, HotelName, Location, Dining, Parking FROM Hotel";
		List<Hotel> list = jdbcTemplate.query(selectAllQuery, new HotelMapper());
		return list;
	}

}
