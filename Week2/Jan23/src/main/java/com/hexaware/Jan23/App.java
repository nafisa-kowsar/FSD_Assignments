package com.hexaware.Jan23;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.Jan23.config.AppConfig;
import com.hexaware.Jan23.entity.Hotel;
import com.hexaware.Jan23.service.HotelServiceImp;



public class App 
{
	static Scanner scanner = new Scanner(System.in);
	
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HotelServiceImp service = context.getBean(HotelServiceImp.class);
        boolean flag = true;

		while (flag) {
			System.out.println("******WELCOME HMS*****");
			System.out.println("1. INSERT");
			System.out.println("2. SELECT BY LOCATION");
			System.out.println("3. SELECT ALL");
			System.out.println("4. EXIT");
			
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:{
				
				Hotel hotel = readData();
				
				boolean isInserted = service.insertHotel(hotel);
				if(isInserted)
					System.out.println("Hotel inserted successfully");
				else
					System.out.println("Insertion failed");
				

				break;
			}
			case 2:{
				scanner.nextLine();
				System.out.println("Enter Location");
				String location = scanner.nextLine();
				List<Hotel> list = service.selectHotelByLocation(location);
				for(Hotel hotl: list) {
					System.out.println(hotl);
				}
				break;
			}
			case 3:{
				
				List<Hotel> list = service.selectAllHotels();
				for(Hotel hotl: list) {
					System.out.println(hotl);
				}
				
				

				break;
			}
			case 4:
				flag = false;
				System.out.println("Thank You!!");
				break;

			default:
				break;
			}

		}
    }
    public static Hotel readData() {
		Hotel hotel = new Hotel();
		System.out.println("Enter Hotel Id:");
		hotel.setHotelID(scanner.nextLong());
		scanner.nextLine();
		System.out.println("Enter Hotel Name:");
		hotel.setHotelName(scanner.nextLine());
		System.out.println("Enter Location:");
		hotel.setLocation(scanner.nextLine());
		System.out.println("Enter Dining Availibility: ");
		hotel.setDining(scanner.nextBoolean());
		System.out.println("Enter Parking Availibility:");
		hotel.setParking(scanner.nextBoolean());
		
		return hotel;
	}
}
