package datetime.java08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime lDateTime=LocalDateTime.now();
		System.out.println(lDateTime);
		
		//convert LocalDateTime => LocalDate and LocalTime
		LocalDate ldate=lDateTime.toLocalDate();
		LocalTime ltime=lDateTime.toLocalTime();
		
		
		LocalDateTime atTime= ldate.atTime(ltime);
		LocalDateTime atDate= ltime.atDate(ldate);
	}
}
