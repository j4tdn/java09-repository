package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	//java07: Date and calendar
	//java08: localDate and localTime
	public static void main(String[] args) {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate=LocalDate.now();
		ldate=ldate.withMonth(11);
		System.out.println("ldate:   "+formatter.format(ldate));
		
		LocalDate formatted=LocalDate.parse("12/12/2020", formatter);
		System.out.println("formatter"+formatted);
		
		System.out.println("==================");
		LocalDate start=LocalDate.of(2020, Month.AUGUST, 12);
		LocalDate end=LocalDate.of(2020, Month.DECEMBER, 8);
		
		
		//period: tinh khoang thoi gian
		Period period= Period.between(start, end);
		System.out.println("year=    "+period.getYears());
		System.out.println("month=    "+period.getMonths());
		System.out.println("day=    "+period.getDays());
	}
}
