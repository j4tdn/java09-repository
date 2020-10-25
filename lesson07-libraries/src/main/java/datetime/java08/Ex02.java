package datetime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import common.TimeRange;
import utils.DateUtils;
public class Ex02 {
//	JAVA07:Date, Calendar
//	JAVA08:LocalTime,LocalTime,LocalTimeTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime ltime = LocalTime.now();
		ltime.withMinute(12);// set tháng
		System.out.println("ltime: " + formatter.format(ltime));
		LocalTime formatted = LocalTime.parse("05:40:32", formatter);
		System.out.println("formated: " + formatted);
		System.out.println("============================");
		LocalTime start = LocalTime.of(10, 15, 16);
		LocalTime end = LocalTime.now();
		
		Duration duration = Duration.between(start, end);
		TimeRange timerange=DateUtils.getDurations(duration);
		System.out.println(timerange);
	}
}
