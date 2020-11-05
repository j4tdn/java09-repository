package exercises.java07;

import java.util.Calendar;
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

public class Ex01 {
	private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		getAllSundaysInYear();
		getLastSunday();
	}

	private static void getLastSunday() {
		System.out.println("=== Get last sunday ===");
		Calendar c = Calendar.getInstance();
		c.set(MONTH, 11);
		c.set(DAY_OF_MONTH, 31);
		
		if(c.get(DAY_OF_WEEK) != 1) {
			c.add(DAY_OF_MONTH, 1 - c.get(DAY_OF_WEEK));
		}
		System.out.println(formatter.format(c.getTime()));
		
	}

	private static void getAllSundaysInYear() {
		System.out.println("=== In ra thông tin các ngày chủ nhật trong năm ===");
		
		Calendar c = Calendar.getInstance();
		int curYear = c.get(YEAR);
		c.set(MONTH, 0);
		c.set(DAY_OF_MONTH, 1);
		
		if(c.get(DAY_OF_WEEK) != 1) {
			c.add(DAY_OF_MONTH, 8 - c.get(DAY_OF_WEEK));
		}
		
		while(c.get(YEAR) == curYear) {
			System.out.println(formatter.format(c.getTime()));
			c.add(DAY_OF_YEAR, 7);
		}
	}
}
