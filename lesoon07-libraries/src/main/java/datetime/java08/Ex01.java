package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	// JAVA07: Date, Calendar
	// JAVA08: LocalDate, LocalTime, LocalDateTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withMonth(11);
		System.out.println("ldate: " + formatter.format(ldate));
		LocalDate formatted = LocalDate.parse("09/08/1999", formatter);
		System.out.println("formatted: " + formatted);

		System.out.println("--------------");
		LocalDate start = LocalDate.of(1999, Month.AUGUST, 9);
		LocalDate end = LocalDate.of(2020, Month.OCTOBER, 25);

		// period
		Period period = Period.between(start, end);
		System.out.println(
				"Thọ: " + period.getYears() + " năm  " + period.getMonths() + " tháng " + period.getDays() + " ngày");
		
	}
}
