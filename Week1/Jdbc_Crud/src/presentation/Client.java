package presentation;

import java.util.List;
import java.util.Scanner;

import dao.DeptDaoImp;
import dao.IDeptDao;
import entity.Dept;

public class Client {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		IDeptDao dao = new DeptDaoImp();
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("WELCOME DMS");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. DELETE");
			System.out.println("4. SELECT BY ID");
			System.out.println("5. SELECT ALL");
			System.out.println("6. EXIT");
			
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				Dept dept1 = readData();
				int count = dao.insertDept(dept1);
				System.out.println(count + " record inserted successfully");
			
				break;
			case 2:
				Dept dept2 = readData();
				int count2 = dao.updateDept(dept2);
				System.out.println(count2 + "record updated succesfully");
				break;
			case 3:
				System.out.println("Enter DNo");
				int dno3 = scanner.nextInt();
				int count3 = dao.deleteOne(dno3);
				System.out.println(count3 + "records deleted successfully");
				break;
			case 4:
				System.out.println("Enter DNo");
				int dno4 = scanner.nextInt();
				Dept dept4 = dao.selectOne(dno4);
				System.out.println(dept4);
				break;
			case 5:
				List<Dept> list = dao.selectAll();
				list.stream().forEach(System.out::println);
				break;
			case 6:
				System.out.println("Thank You!!");

			default:
					break;
		}	
			
		}

	}
	
	public static Dept readData() {
		System.out.println("Enter Dno:");
		int dno = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Dname:");
		String dname = scanner.nextLine();
		System.out.println("Enter Location:");
		String loc = scanner.nextLine();
		
		Dept dept = new Dept(dno,dname,loc);
		
		return dept;
		
	}
	
	

}
