package datetime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	// java7: date , calendar
	// java08: localdate, localtime,localdatetime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withMonth(11);
		formatter.format(ldate);
		System.out.println("ldate: " + formatter.format(ldate));
		LocalDate formatted = LocalDate.parse("18/12/1998", formatter);
		System.out.println("formatted: " + formatted);
		System.out.println("==========================");
		LocalDate start = LocalDate.of(2020, Month.AUGUST, 12);
		LocalDate end = LocalDate.of(2020, Month.DECEMBER, 8);
		//period: localdate
		Period period = Period.between(start, end);
		System.out.println("period: " + period);

		
		

	}

}
