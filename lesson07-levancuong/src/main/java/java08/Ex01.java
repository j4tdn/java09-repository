package java08;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex01 {
	public static void main(String[] args) {
		LocalDate lDate = LocalDate.now();
		getAllSundaysInYear(lDate);
		getLastSunday(lDate, 2020);

	}

	private static void getAllSundaysInYear(LocalDate lDate) {
		for (int day = 1; day <= lDate.lengthOfYear(); day++) {
			lDate = lDate.withDayOfYear(day);
			if (lDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
				System.out.println(lDate);
			}
		}
	}

	private static void getLastSunday(LocalDate lDate, int year) {
		lDate = lDate.withYear(year);
		for (int day = lDate.lengthOfYear(); day >= 1; day--) {
			lDate = lDate.withDayOfYear(day);
			if (lDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
				System.out.println(lDate);
				break;
			}
		}
	}
}
