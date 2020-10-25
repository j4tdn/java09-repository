package datetime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import common.TimeRange;
import utils.DateUtils;

public class Ex02 {
	// java07: Date and calendar
	// java08: LocalTime and localTime
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime ltime = LocalTime.now();
		ltime = ltime.withMinute(46);
		System.out.println("ltime:   " + formatter.format(ltime));

		LocalTime formatted = LocalTime.parse("05:40:32", formatter);
		System.out.println("formatter:    " + formatted);

		System.out.println("==================");
		LocalTime start = LocalTime.of(10, 15, 16);
		LocalTime end = LocalTime.now();

//		
//		//period: tinh khoang thoi gian
		Duration duration = Duration.between(start, end);
		TimeRange timeRange = DateUtils.getDurations(duration);

		System.out.println(timeRange);

	}
}
