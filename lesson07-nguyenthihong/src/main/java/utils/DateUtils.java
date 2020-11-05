package utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;

import common.DateRange;
import common.DateTimeRange;
import common.TimeRange;

public class DateUtils {
	public static DateTimeRange getDateTimeRange(LocalDateTime start, LocalDateTime end) {

		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();

		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);

		if (timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			dateEnd = dateEnd.minusDays(1);
			period = Period.between(dateStart, dateEnd);
			
		}

		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();

		DateRange dateRange = new DateRange(years, months, days);
		TimeRange timeRange = getDurations(duration);
		return DateTimeRange.builder().withDateRange(dateRange).withTimeRange(timeRange).build();
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
