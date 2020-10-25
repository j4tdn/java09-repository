package datetime.java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

import common.DateRange;
import common.DateTimeRange;
import utils.DateUtils;

public class Ex04 {
	/*
	 * + 20/04/2020 10:20:30 - 22/06/2020 12:05:30
	 * + 
	 */
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020,4,20,10,20,30);
		LocalDateTime end = LocalDateTime.of(2022,4,20,8,5,30);
		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(start,end);
		System.out.println(dateTimeRange);
	}
}
