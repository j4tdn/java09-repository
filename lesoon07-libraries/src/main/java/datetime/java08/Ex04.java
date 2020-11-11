package datetime.java08;

import java.time.LocalDateTime;
import commom.DateTimeRange;
import utils.DateUtils;

public class Ex04 {
	public static void main(String[] args) {
		/**
		 * Tinh khoang thoi gian yeu nhau
		 * 20/04/2020 10:20:30 - 22/06/2020 12:05:30
		 * 20/04/2020 10:20:30 - 22/06/2020 08:05:30
		 * 20/04/2020 10:20:30 - 20/02/2022 08:05:30
		 * 20/04/2020 10:20:30 - 20/04/2022 08:05:30
		 * 
		 */

		LocalDateTime start = LocalDateTime.of(2020, 4, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 2, 20, 8, 5, 30);

		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(start, end);
		System.out.println(dateTimeRange);
	}
}