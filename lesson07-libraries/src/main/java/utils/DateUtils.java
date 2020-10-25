package utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import common.DateRange;
import common.DateTimeRange;
import common.DateTimeRange.Builder;
import common.DayOfWeek;
import common.TimeRange;

public class DateUtils {
	private DateUtils() {
		
	}
	
	public static String getDayOfWeek(int dayOfWeek) throws Exception {
		if (dayOfWeek < 1 || dayOfWeek > 7) {
			throw new Exception("Day of week out of range (1-7");
		}
		
		return DayOfWeek.values()[dayOfWeek - 1].name();
	}
	
	public static TimeRange getDurations(Duration duration) {
		long hours = duration.toHours();
		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();
		long seconds = duration.minusMinutes(minutes).toSeconds();		
		
		return new TimeRange(hours, minutes, seconds);
	}
	
	public static DateTimeRange getDateTimeRange(LocalDateTime start, LocalDateTime end) {
		DateTimeRange dateTimeRange = null;
		
		if(end.isBefore(start)) {
			return null;
		}
		
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();
		Duration duration = Duration.between(startTime, endTime);
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		Period period = Period.between(startDate, endDate);
		
		if(endTime.isBefore(startTime)) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
			period = Period.between(startDate, endDate);
		}
		
		DateRange dateRange = new DateRange(period.getYears(), period.getMonths(), period.getDays());
		TimeRange timeRange = DateUtils.getDurations(duration);
		
		Builder builder = DateTimeRange.builder()
				.withDateRange(dateRange)
				.withTimeRange(timeRange);
		dateTimeRange = builder.build();
		
		return dateTimeRange;
	}
}
