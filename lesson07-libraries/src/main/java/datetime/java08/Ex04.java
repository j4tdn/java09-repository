package datetime.java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import common.DateRange;
import common.DateTimeRange;
import common.TimeRange;
import utils.DateUtils;

public class Ex04 {

	/**
	 * 20/04/2020 10:20:30 -- 22/06/2020 12:05:30 
	 * 20/04/2020 10:20:30 -- 22/06/2020 08:05:30
	 * 20/04/2020 10:20:30 -- 20/02/2022 08:05:30
	 * 20/04/2020 10:20:30 -- 20/04/2022 08:05:30
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
//		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//		LocalDate startDate1 = LocalDate.parse("", dateFormatter);
//		LocalTime startTime1 = LocalTime.parse("",timeFormatter);
//		
//		LocalDate endDate1 = LocalDate.parse("", dateFormatter);
//		LocalTime endTime1 = LocalTime.parse("",timeFormatter);

//		Tiên làm============================================
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//		LocalDateTime start1 = LocalDateTime.parse("20/04/2020 10:20:30", formatter);
//		LocalDateTime end1 = LocalDateTime.parse("22/06/2020 12:05:30", formatter);
//		LocalDate dstart1 = start1.toLocalDate();
//		LocalTime tstart1 = start1.toLocalTime();
//		LocalDate dend1 = end1.toLocalDate();
//		LocalTime tend1 = end1.toLocalTime();
//		
//		Period period = Period.between(dstart1, dend1);
//		Duration duration = Duration.between(tstart1, tend1);
//		TimeRange timeRange = DateUtils.getDurations(duration);
//		DateTimeRange dateTimeRange = DateTimeRange.builder()
//				.withDateRange(new DateRange(period.getYears(), period.getMonths(), period.getDays()))
//				.withTimeRange(timeRange)
//				.build();
//		System.out.println(dateTimeRange);

		// Anh làm============================================
		LocalDateTime start = LocalDateTime.of(2020, 04, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 04, 20, 8, 05, 30);
		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(start, end);
		System.out.println(dateTimeRange);

	}
}
