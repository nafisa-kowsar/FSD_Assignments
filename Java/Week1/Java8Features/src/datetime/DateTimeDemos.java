package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDate independent = LocalDate.of(1947, 8, 15);
		System.out.println(independent);
		
		String str = "2001-10-08";
		LocalDate dob = LocalDate.parse(str);
		System.out.println(dob);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String s1 = "08-10-2001";
		LocalDate dobF = LocalDate.parse(s1, format);
		System.out.println(dobF);
		
		DateTimeFormatter format2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

	 	String date2 =	date1.format(format2);
	
	    System.out.println(date2);
	
	    
				
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd MM yyyy");	
		String date3 = date1.format(format3);
		System.out.println(date3);
				
	    
		

	}

}
