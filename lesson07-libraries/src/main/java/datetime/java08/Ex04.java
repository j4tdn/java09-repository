package datetime.java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import common.TimeRange;
import utils.DateUtils;

public class Ex04 {
	/**
	 A và B quen nhau đã được chừng ấy năm
      Ngày bắt đầu- Ngày kết thúc
      
      +   20/04/2020 10:20:30 - 22/06/2020 12:05:30
      +   20/04/2020 10:20:30 - 22/06/2020 08:05:30
      +   20/04/2020 10:20:30 - 20/02/2022 08:05:30
      +   20/04/2020 10:20:30 - 20/04/2022 08:05:30   
	  Kiểm tra xem 2 bạn đã yêu nhau được bao nhiêu
	  Năm - Tháng - Ngày – Giờ - Phút - Giây
	 */
	public static void main(String[] args) {
		LocalDateTime start = LocalDateTime.of(2020, 04, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 04, 20, 8, 05, 30);
		System.out.println(DateUtils.getDateTimeRange(start, end));
		System.out.println("===================");
		getDateTimeRange(start, end);
	}
	
	private static void getDateTimeRange(LocalDateTime start, LocalDateTime end) {
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();

		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			// period = period.minusDays(1); // wrong -1
			period = Period.between(dateStart, dateEnd.minusDays(1));
		}
		
		System.out.println("duration: " + getDurations(duration));
		System.out.println("period: " + period.getYears() + ", " + period.getMonths() + ", " + period.getDays());
		
	}
	
	public static TimeRange getDurations(Duration duration) {
		long durations = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();
		long seconds = duration.minusMinutes(minutes).getSeconds();
		return new TimeRange(hours, minutes, seconds);
	}
}
