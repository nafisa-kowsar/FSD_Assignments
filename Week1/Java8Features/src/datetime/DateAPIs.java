package datetime;

import java.time.LocalDate;

public class DateAPIs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
		
		LocalDate date2 = LocalDate.of(1986, 12, 12);
		
		System.out.println(date1.isLeapYear());
		
		System.out.println(date1.isBefore(date2));
		
		System.out.println(date1.plusMonths(100));
		
		System.out.println(date1.plusYears(20));
		
		System.out.println(date1.minusMonths(12));
		
		System.out.println(date1.withYear(2001));
		
		System.out.println(date1.getDayOfYear());
		
		System.out.println(date1.getYear());

	}

}
