package java07;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		getAllSundaysInYear();
		System.out.println("-------------------");
		getLastSunday(2021);
	}
	

	private static void getAllSundaysInYear() {
		Calendar c = Calendar.getInstance();
		int days, month, year;

		for (int day = 1; day < c.getActualMaximum(Calendar.DAY_OF_YEAR); day++) {
			c.set(Calendar.DAY_OF_YEAR, day);
			if (c.get(Calendar.DAY_OF_WEEK) == 1) {
				days = c.get(Calendar.DAY_OF_MONTH);
				month = c.get(Calendar.MONTH) + 1;
				year = c.get(Calendar.YEAR);
				System.out.println(days + "-" + month + "-" + year);
			}
		}
	}

	private static void getLastSunday(int year) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		for (int day = c.getActualMaximum(Calendar.DAY_OF_YEAR); day >= 1; day--) {
			c.set(Calendar.DAY_OF_YEAR, day);
			if (c.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.println(
						c.get(Calendar.DAY_OF_MONTH) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.YEAR));
				break;
			}
		}

	}
}
