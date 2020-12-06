package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	// JAVA07: Date, Calendar
	// JAVA08: LocalDate, LocalTime, LocalDatetime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withMonth(11);
		System.out.println("ldate: " + formatter.format(ldate));

		LocalDate formatted = LocalDate.parse("18/12/1998", formatter);
		System.out.println("formated: " + formatted);

		System.out.println("=======================");
		LocalDate start = LocalDate.of(2020, Month.JANUARY, 12);
		LocalDate end = LocalDate.of(2020, Month.APRIL, 8);

		// Period: LocalDate
		Period period = Period.between(start, end);
		System.out.println("years: " + period.getYears());
		System.out.println("months:" + period.getMonths());
		System.out.println("days: " + period.getDays());

	}
}
