package com.hexaware.MappingsExercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.MappingsExercise.entity.Hotel;
import com.hexaware.MappingsExercise.entity.HotelOwner;



public class OneToOne 
{
    public static void main( String[] args )
    {
    	 
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	Transaction txn = session.beginTransaction();
    	
    	HotelOwner hotelOwner = new HotelOwner(10, "Maneesh");
    	
    	Hotel hotel = new Hotel(101, "Cozy Stay", hotelOwner);
    	
    	session.persist(hotel);
    	txn.commit();
    }
}
