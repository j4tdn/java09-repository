package datatime.java08;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex01 {
	public static void main(String[] args) {
		
		DateTimeFormatter fommatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//java08: loacalDay,localTime,LocalDayTime
		LocalDate ldate=LocalDate.now();
		ldate=	ldate.withMonth(11);
		
		System.out.println("ldate:"+fommatter.format(ldate));
		
		LocalDate formatted=LocalDate.parse("18/12/1999",fommatter) ;
		System.out.println("formatted:"+formatted);
		
		
		System.out.println("==========================");
		LocalDate start=LocalDate.of(2020, Month.AUGUST, 12);
		LocalDate end=LocalDate.of(2020, Month.DECEMBER, 8);
		Period period=Period.between(start, end);
		System.out.println("period:"+period.getDays());
		System.out.println("period:"+period.getMonths());
		System.out.println("period:"+period.getYears());
		
		
		
	}
}
