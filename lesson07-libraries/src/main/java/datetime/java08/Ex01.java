package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	// JAVA 07 : date , calendar
	// JAVA 08 : LocalDate, LocalTime, LocalDateTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate lDate = LocalDate.now();
		lDate =  lDate.withMonth(11);
		
		System.out.println("ldate:" + formatter.format(lDate));
		
		LocalDate formatted = LocalDate.parse("18/12/1998", formatter);
		System.out.println("formatted:" +formatted);
		
		System.out.println("===================");
		LocalDate start = LocalDate.of(2020, Month.AUGUST,12);
		LocalDate end = LocalDate.of(2020, Month.DECEMBER,8);
		//  Period : LocalDate
		Period period = Period.between(start,end);
		System.out.println("days:" + period.getDays());
		System.out.println("months:" + period.getMonths());
		System.out.println("years:" + period.getYears());
	}
}
