package datetime.java08;

import java.time.LocalDateTime;

import common.DateTimeRange;
import utils.DateUtils;

public class Ex04 {
	//

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 04, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 04, 20, 8, 05, 30);
		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(start,end);
		System.out.println(dateTimeRange);

	}

}
