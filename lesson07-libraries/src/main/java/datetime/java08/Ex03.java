package datetime.java08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03 {
	public static void main(String[] args) {
		LocalDateTime ldatetiem = LocalDateTime.now();
		System.out.println("Local Datetime :" + ldatetiem);
		
		//convert LocalDateTime =>
		//+ LocalDate
		//+ LocalTime
		
		LocalDate ldate = ldatetiem.toLocalDate();
		LocalTime ltime = ldatetiem.toLocalTime();
		
		LocalDateTime atTime = ldate.atTime(ltime);
		LocalDateTime atDate = ltime.atDate(ldate);
	}
}
