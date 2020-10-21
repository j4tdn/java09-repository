package utils;

import commom.DaysOfWeek;

public class DateUtils {

	private DateUtils() {
		
	}
	public static String getDaysOfWeek(int dow) {
		if (dow < 1 || dow > 7 ) {
			throw new RuntimeException("day of weeks out range(1-7)");
		}
		return DaysOfWeek.values()[dow-1].name() ;
	}
}
