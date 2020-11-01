package datatime.java08;

import java.time.LocalDateTime;

import common.DateTimeRange;
import utils.DateUtils;

public class Ex04 {
	// ngay bd:20/04/2020 10:20:30
	// kt: 22/06/2020 12:05:30

	// ngay bd:20/04/2020 10:20:30
	// kt: 22/06/2020 08:05:30

	// ngay bd:20/04/2020 10:20:30
	// kt: 20/02/2022 08:05:30
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 04, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2020, 06, 22, 12, 05, 30);
		System.out.println(DateUtils.getDateTimeRange(start, end));
	}
}
