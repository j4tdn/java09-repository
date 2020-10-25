package datetime.java08;

import java.time.LocalDateTime;
import java.time.Month;
import common.DateTimeRange;
import utils.DateUtils;

public class Ex04 {
	//kiểm tra 2 bạn đã yêu nhau được bao lâu: năm - tháng - ngày - giờ - phút - giây
	// 20/04/2020 10:20:30 đến 22/06/2020 12:05:30
	//20/04/2020 10:20:30 đến 22/06/2020 08:05:30
	// 20/04/2020 10:20:30 đến 20/02/2022 12:05:30
	// 20/04/2020 10:20:30 đến 20/04/2022 8:05:30
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 4, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 4, 20, 8, 05, 30);
		DateTimeRange dtr = DateUtils.getDateTimeRange(start, end);
		System.out.println(dtr);
		
	}
}
