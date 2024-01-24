package com.hexaware.springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springjdbc.config.AppConfig;
import com.hexaware.springjdbc.exception.ProductNotFoundException;
import com.hexaware.springjdbc.model.Product;
import com.hexaware.springjdbc.service.ProductServiceImp;


public class App {
	
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args)  {
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 ProductServiceImp service = context.getBean(ProductServiceImp.class);
		
		boolean flag = true;

		while (flag) {
			System.out.println("WELCOME DMS");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");
			
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:{
				
				Product product = readData();
				
				boolean isInserted = service.createProduct(product);
				if(isInserted)
					System.out.println("Product created successfully");
				else
					System.out.println("Creation failed");
				

				break;
			}
			case 2:{
				Product product = readData();
				
				boolean isInserted = service.updateProduct(product);
				if(isInserted)
					System.out.println("Product updated successfully");
				else
					System.out.println("Update failed");
				break;
			}
			case 3:{
				
				System.out.println("Enter Product ID:");
				int productId = scanner.nextInt();
				boolean isInserted;
				try {
					isInserted = service.deleteProductById(productId);
					if(isInserted)
						System.out.println("Product deleted successfully");
					else
						System.err.println("Deletion failed");
				} catch (ProductNotFoundException e) {
					e.printStackTrace();
				}
			

				break;
			}
			case 4:{
				System.out.println("Enter Product ID:");
				int productId = scanner.nextInt();
				Product product;
				try {
					product = service.selectProductById(productId);
					if(product!=null) {
						System.out.println("Product found successfully");
						System.out.println(product);
					}
					else
						System.err.println("Product not found");
				} catch (ProductNotFoundException e) {
					e.printStackTrace();
				}
				}
			
				break;
			
			case 5:{
				
					List<Product> list = service.selectAllProducts();
					for(Product pro: list) {
						System.out.println(pro);
					}
				break;
			}
			case 6:
				flag = false;
				System.out.println("Thank You!!");
				break;

			default:
				break;
			}

		}
	}
	public static Product readData() {
		Product product = new Product();
		System.out.println("Enter Product Id:");
		product.setProductId(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter Product Name:");
		product.setProductName(scanner.nextLine());
		System.out.println("Enter Product Price:");
		product.setPrice(scanner.nextInt());
		
		return product;
	}
}
