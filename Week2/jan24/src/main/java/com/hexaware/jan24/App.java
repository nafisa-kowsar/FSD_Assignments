package com.hexaware.jan24;

import java.util.List;
import java.util.Scanner;

import com.hexaware.jan24.service.IHotelService;

import com.hexaware.jan24.service.HotelServiceImp;

import com.hexaware.jan24.entity.Hotel;

public class App {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		IHotelService service = new HotelServiceImp();

		boolean flag = true;

		while (flag) {

			System.out.println("******WELCOME HMS*****");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE HOTEL");
			System.out.println("3. DELETE HOTEL BY NAME");
			System.out.println("4. SELECT HOTEL BY LOCATION");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				Hotel hotel = readData();
				boolean isInserted = service.insertHotel(hotel);
				if (isInserted)
					System.out.println("Hotel inserted successfully");
				else
					System.out.println("Insertion failed");

				break;
			}
			case 2: {
				Hotel hotel = readData();
				boolean isInserted = service.updateHotel(hotel);
				if (isInserted)
					System.out.println("Hotel updated successfully");
				else
					System.out.println("Updation failed");
				break;
			}
			case 3: {

				System.out.println("Enter Hotel Name");
				scanner.nextLine();
				String name = scanner.nextLine();
				boolean isDeleted = service.deleteHotelByName(name);
				if (isDeleted)
					System.out.println("Deletion successful");
				else
					System.out.println("Deletion failed");
				break;
			}
			case 4: {
				System.out.println("Enter Location:");
				scanner.nextLine();
				String location = scanner.nextLine();
				List<Hotel> list = service.selectHotelByLocation(location);
				if (list.isEmpty()) {
					System.out.println("No hotels found for the specified location.");
				} else {
					for (Hotel hotl : list)
						System.out.println(hotl.toString());
				}
				break;

			}

			case 5: {
				List<Hotel> list = service.selectAllHotels();
				if (list.isEmpty()) {
					System.out.println("No hotels found");
				} else {
					for (Hotel hotl : list)
						System.out.println(hotl.toString());
				}
				break;
			}
			case 6: {
				flag = false;
				System.out.println("Thank You!!");
				break;

			}

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
