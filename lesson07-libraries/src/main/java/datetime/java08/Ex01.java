package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	// Java07: Date, Calendar
	//Java08: LocalDate, LocalTime, LocalDateTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withMonth(11);
		
		LocalDate formatted = LocalDate.parse("30/04/2000", formatter);// string->LocalDate
		
		System.out.println("Date: " + formatter.format(ldate));
		
		
		System.out.println("==================================");
		LocalDate start = LocalDate.of(2000, Month.AUGUST, 12);
		LocalDate end = LocalDate.of(2000, Month.DECEMBER, 8);
		// Period: LocalDate
		Period period = Period.between(start, end);
		System.out.println("Day: " + period.getDays());
		System.out.println("Month: " + period.getMonths());
		System.out.println("Year: " + period.getYears());
	}
}
