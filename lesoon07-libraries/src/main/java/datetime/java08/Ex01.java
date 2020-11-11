package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withMonth(11);
		System.out.println("ldate: " + ldate);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("formatted: " + formatter.format(ldate));

		LocalDate ldate2 = LocalDate.parse("23/09/1985", formatter);
		System.out.println("ldate2: " + ldate2);

		System.out.println("====================");
		LocalDate start = LocalDate.of(2020, Month.AUGUST, 12);
		LocalDate end = LocalDate.of(2020, Month.DECEMBER, 8);

		// Period: LocalDate
		Period period = Period.between(start, end);
		System.out.println("days: " + period.getDays());
		System.out.println("months: " + period.getMonths());
		System.out.println("years: " + period.getYears());
	}
}
