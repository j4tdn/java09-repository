package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Ex01 {
	//Java08 : LocalDate, LocalTime, LocalDateTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
		LocalDate ldate= LocalDate.now();
		ldate=ldate.withMonth(11);
		//LocalDate formatted = LocalDate.parse("18/12/1998", formatter);
		
		System.out.println("ldate: " + formatter.format(ldate));
		System.out.println("----------------------------------------");
		LocalDate start = LocalDate.of(2020, Month.AUGUST, 12);
		LocalDate end = LocalDate.of(2020, Month.DECEMBER, 8);
		
		Period period = Period.between(start, end);
		System.out.println("Period : " + period);
		System.out.println("days: " + period.getDays());
		System.out.println("months: " + period.getMonths());
		System.out.println("years: " + period.getYears());
	}
}
