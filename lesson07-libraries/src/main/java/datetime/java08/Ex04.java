package datetime.java08;

import java.time.LocalDateTime;
import utils.DateUtils;

public class Ex04 {
	/*
	 * A quen B ngày bắt đầu- ngày kết thúc 20/04/2020 10:20:30 - 22/06/2020
	 * 12:05:30 20/04/2020 10:20:30 - 22/06/2020 08:05:30 20/04/2020 10:20:30 -
	 * 20/02/2022 12:05:30
	 */
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 04, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 04, 20, 8, 5, 30);
		System.out.println(DateUtils.getDateTimeRange(start, end));
	}

}
