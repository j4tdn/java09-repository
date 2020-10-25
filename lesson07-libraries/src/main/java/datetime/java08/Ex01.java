package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	public static void main(String[] args) {
		//java07: Date, Calendar
		//java08: LocalDate, LocalTime, LocalDateTime
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate ldate = LocalDate.now();
		ldate.withMonth(11);
		
		
		System.out.println("local date: " + formatter.format(ldate));
		
		LocalDate formatted =  LocalDate.parse("18/12/1998", formatter);
		System.out.println("formated: " +formatted);
		
		System.out.println("=====================");
		
		LocalDate start = LocalDate.of(2020, Month.AUGUST, 12);
		LocalDate end = LocalDate.of(2020, Month.DECEMBER, 8);
		
		
		Period period = Period.between(start, end);
		System.out.println("days: " + period.getDays());
		System.out.println("months: " + period.getMonths());
		System.out.println("years: " + period.getYears());
		
	}
}
