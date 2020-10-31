package datetime.java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import common.DateTimeRange;
import utils.DayUtils;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 04, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 04, 20, 8, 05, 30);
		System.out.println(DayUtils.getDateTimeRange(start, end));
	}
}
