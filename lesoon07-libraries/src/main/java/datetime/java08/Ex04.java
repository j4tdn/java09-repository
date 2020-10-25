package datetime.java08;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import utils.DateUtils;

public class Ex04 {
	/**
	 a va b quen nhau
	 +20/04/2020 10:20:30 - 22/06/2020 12:05:30
	 +20/04/2020 10:20:30 - 22/06/2020 08:05:30
	 +20/04/2020 10:20:30 - 22/02/2022 08:05:30
	 
	 kiểm tra xem 2 bạn đã yêu nhau được bao nhiêu
	 năm - tháng - ngày - giờ - phút - giây
	 */

	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 04, 20, 10, 20, 30);
		LocalDateTime end	= LocalDateTime.of(2022, 04, 20, 8, 05, 30);
		
		System.out.println(DateUtils.getDateTimeRange(start , end));
	
	}
}
