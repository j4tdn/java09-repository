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

	// java07 : date, Calendar
	// java08 : LocalTime, localTime , LocalTimeTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime Ltime = LocalTime.now();
		Ltime = Ltime.withMinute(46);
		System.out.println("Ltime :" + formatter.format(Ltime));

		LocalTime fornatted = LocalTime.parse("05:40:32", formatter);
		System.out.println("formated : " + fornatted);

		System.out.println("===============");
		LocalTime start = LocalTime.of(10, 15, 16);
		LocalTime end = LocalTime.now();

		// Duration : LocalTime
		Duration duration = Duration.between(start, end);
		TimeRange timeRange = DateUtils.getDurations(duration);
		System.out.println(timeRange);
	}
}
