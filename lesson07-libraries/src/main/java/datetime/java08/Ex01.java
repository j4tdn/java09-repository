package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate ldate = LocalDate.now();
		System.out.println("LocalDate : " + ldate);
		ldate = ldate.withYear(2019);//set nam
		System.out.println("LocalDate : " + formatter.format(ldate));
		
		LocalDate fomatted = LocalDate.parse("12/02/2010", formatter);
		System.out.println("Formatted : " + fomatted);

		
		System.out.println("==================================================");
		
		LocalDate start = LocalDate.of(2020, Month.AUGUST, 12);
		LocalDate end = LocalDate.of(2020, Month.DECEMBER, 15);
		
		//In ra khoang thoi gian giua 2 moc
		Period period = Period.between(start, end);
		System.out.println("Days : " + period.getDays());
		System.out.println("Months : " + period.getMonths());
		System.out.println("Years : " + period.getYears());
	}
}
