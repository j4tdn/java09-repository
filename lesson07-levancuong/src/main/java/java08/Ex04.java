package java08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Ex04 {
	public static void main(String[] args) {
		// 1.
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("UTC-5"));
		System.out.println(
				zonedDateTime.getYear() + "-" + zonedDateTime.getMonth() + "-" + zonedDateTime.getDayOfMonth() + "-"
						+ zonedDateTime.getHour() + "-" + zonedDateTime.getMinute() + "-" + zonedDateTime.getSecond());
		// 2.
		LocalDate localDate = localDateTime.toLocalDate();
		System.out.println("month current has " + localDate.lengthOfMonth() + " day");
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		// 3
		LocalDate lDate = LocalDate.of(year, month, day);
		lDate = lDate.withDayOfMonth(localDate.lengthOfMonth());
		System.out.println("date last of month current:" + lDate);
		// 4.
		lDate = LocalDate.of(year, month, day);
		for (int d = 1; d <= localDate.lengthOfMonth(); d++) {
			lDate = lDate.withDayOfMonth(d);
			if (lDate.getDayOfWeek() == DayOfWeek.MONDAY && (localDate.getDayOfMonth() - d < 7)) {
				System.out.println("date first and last in week current:" + lDate + "--------" + lDate.plusDays(6));
				break;
			}
		}
		// 5
		int currentWeek = localDate.getDayOfYear() / 7;
		if (localDate.getDayOfYear() % 7 != 0) {
			currentWeek++;
		}
		System.out.println("week of year:" + currentWeek);

		// 6
		lDate = LocalDate.of(year, month, day);
		LocalTime localTime = localDateTime.toLocalTime();
		int temp = localTime.getHour() + 15;
		localTime = localTime.plusHours(15);

		if (temp >= 24) {
			lDate = lDate.plusDays(1);
		}
		System.out.println(lDate + "--" + localTime);

		// 7
		LocalDate start = LocalDate.of(2020, 1, 7);
		LocalDate end = LocalDate.now();
		Period period = Period.between(start, end);
		System.out.println("period:year= " + period.getYears() + " month=" + period.getMonths());

		// 8
		lDate = LocalDate.of(year, month, day);
		lDate = lDate.plusDays(20);
		System.out.println("date after is " + lDate + " ---- " + lDate.getDayOfWeek());
		// 9
		System.out.println("the number of month remain in year is " + (12 - localDate.getMonthValue()));
		// 10
		LocalDate birthDay = LocalDate.of(1999, 5, 15);
		Period p = Period.between(birthDay, end);
		System.out.println("age:" + p.getYears());

	}
}
