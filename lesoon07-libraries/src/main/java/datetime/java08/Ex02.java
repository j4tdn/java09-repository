package datetime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import commom.TimeRange;
import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		LocalTime ltime = LocalTime.now();
		ltime = ltime.withMinute(46);
		System.out.println("ltime: " + ltime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("formatted: " + formatter.format(ltime));

		LocalTime ltime2 = LocalTime.parse("23:09:01", formatter);
		System.out.println("ltime2: " + ltime2);

		System.out.println("====================");
		LocalTime start = LocalTime.of(2, 45, 11);
		LocalTime end = LocalTime.of(22, 9, 46);

		// Period: LocalTime
		Duration duration = Duration.between(start, end);
		TimeRange timeRange = DateUtils.getDurations(duration);
		System.out.println(timeRange);
	}
}