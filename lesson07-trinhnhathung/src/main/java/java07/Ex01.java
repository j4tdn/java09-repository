package java07;

import java.util.Calendar;
import static java.util.Calendar.*;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("Tat ca ngay chu nhat trong nam:");
		getAllSunDayInYear();
		System.out.println("============================");
		getLastSunday(2019);
	}
	
	private static void getAllSunDayInYear () {
		Calendar ca = Calendar.getInstance();
		ca.set(DAY_OF_MONTH, 1);
		ca.set(MONTH, 0);
		Calendar lastDay = Calendar.getInstance();
		lastDay.set(DAY_OF_MONTH,31);
		lastDay.set(MONTH, 11);
		int firstSunday = ca.get(DAY_OF_MONTH) + 8 - ca.get(DAY_OF_WEEK);
		System.out.println(firstSunday);
		ca.set(DAY_OF_MONTH, firstSunday);
		ca.add(DAY_OF_MONTH, 7);
		do {			
			System.out.println(ca.get(DAY_OF_MONTH));
			ca.add(DAY_OF_MONTH, 7);
		}while (ca.before(lastDay));
	}
	
	private static void getLastSunday (int year) {
		Calendar ca = Calendar.getInstance();
		ca.set(DAY_OF_MONTH, 31);
		ca.set(MONTH, 11);
		ca.set(YEAR,year);
		int lastSunday = 31 - (ca.get(DAY_OF_WEEK)- SUNDAY);
		System.out.print("Ngay chu nhat cuoi cung trong nam:" + lastSunday);
	}
}