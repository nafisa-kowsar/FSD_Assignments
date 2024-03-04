package com.hexaware.MappingsExercise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.hexaware.MappingsExercise.entity.HotelOM;
import com.hexaware.MappingsExercise.entity.Room;

public class OneToMany {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	Session session = sessionFactory.openSession();
    	
    	Transaction txn = session.beginTransaction();
    	
    	Room r1 = new Room(1001, 4);
    	Room r2 = new Room(1002, 2);
    	Room r3 = new Room(1003, 2);
    	
    	HotelOM h1 = new HotelOM();
    	h1.setHotelId(101);
    	h1.setHotelName("Peace Stay");
    	
    	h1.addRoom(r1);
    	h1.addRoom(r2);
    	h1.addRoom(r3);
    	
    	session.persist(h1);
    	
    	txn.commit();

    	
    	

	}

}
