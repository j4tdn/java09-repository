package utils;

import common.DayOfWeek;

public class DateUtils {
	private DateUtils() {
		
	}
	
	public static String getDayOfWeek(int dayOfWeek) throws Exception {
		if (dayOfWeek < 1 || dayOfWeek > 7) {
			throw new Exception("Day of week out of range (1-7");
		}
		
		return DayOfWeek.values()[dayOfWeek - 1].name();
	}
}
