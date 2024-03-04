package com.hexaware.jan24.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.hexaware.jan24.entity.Hotel;
import com.hexaware.jan24.util.HibernateUtil;

public class HotelDaoImp implements IHotelDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();

	@Override
	public boolean insertHotel(Hotel hotel) {
		Transaction txn = session.beginTransaction();
		session.save(hotel);
		txn.commit();
		session.close();
		return hotel.getHotelID() != null;
	}

	@Override
	public boolean updateHotel(Hotel hotel) {
		Transaction txn = session.beginTransaction();
		Hotel hotel1 = session.get(Hotel.class, hotel.getHotelID());
		if (hotel1 != null) {
			hotel1.setHotelName(hotel.getHotelName());
			hotel1.setLocation(hotel.getLocation());
			hotel1.setDining(hotel.isDining());
			hotel1.setParking(hotel.isParking());
			txn.commit();
			session.close();
			return true;
		} else {

			txn.rollback();
			session.close();
			return false;
		}

	}

	@Override
	public List<Hotel> selectHotelByLocation(String location) {
		
		Query query = session.createNamedQuery("selectHotelByLocation");
		query.setParameter("location", location);
		List<Hotel> list = query.getResultList();
		session.close();
		return list;

	}

	@Override
	public boolean deleteHotelByName(String name) {
		Transaction txn = session.beginTransaction();
		String selectQuery = "select h from Hotel h";
		Query query = session.createQuery(selectQuery);
		List<Hotel> hotels = query.getResultList();
		
		for(Hotel h: hotels) {
			 if (h.getHotelName().equals(name)) {
		            session.delete(h);
		            txn.commit();
		            session.close();
		            return true;  
		        }
		}

		txn.commit();
		session.close();
		return false;
	}

	@Override
	public List<Hotel> selectAllHotels() {
		String selectQuery = "select h from Hotel h";
		Query query = session.createQuery(selectQuery);
		List<Hotel> list = query.getResultList();
		session.close();
		return list;
		
	}

}
