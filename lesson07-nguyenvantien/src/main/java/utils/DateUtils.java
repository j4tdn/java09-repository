package utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import common.DateRange;
import common.DateTimeRange;
import common.DayOfWeek;
import common.MonthOfYear;
import common.TimeRange;
import static java.util.Calendar.*;

public class DateUtils {
	private DateUtils() {

	}

	public static String getDayOfWeek(int dow) {
		if (dow < 1 || dow > 7) {
			throw new RuntimeException("Day of week out of range (1-7)");
		}

		return DayOfWeek.values()[dow - 1].name();
	}
	public static String getMonthOfYear(int dow) {
		if (dow < 0 || dow > 11) {
			throw new RuntimeException("Month of year out of range (0-11)");
		}

		return MonthOfYear.values()[dow].name();
	}

	public static TimeRange getDurations(Duration duration) {
		long durations = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();
		long seconds = duration.minusMinutes(minutes).getSeconds();
		return new TimeRange(hours, minutes, seconds);
	}

	public static DateTimeRange getDateTimeRange(LocalDateTime start, LocalDateTime end) {

		LocalDate dateStart = start.toLocalDate();
		LocalTime timeStart = start.toLocalTime();
		LocalDate dateEnd = end.toLocalDate();
		LocalTime timeEnd = end.toLocalTime();

		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);

		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);

				int perviousMonth = dateEnd.getMonthValue() - 1;
				int year = dateEnd.getYear();
				int days = YearMonth.of(year, perviousMonth).lengthOfMonth() - 1;
				period = period.withDays(days);
				if (period.getMonths() < 0) {
					period = period.minusYears(1);
					period = period.withMonths(11);
				}

			}

			duration = duration.plusDays(1);
		}

		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();

		DateRange dateRange = new DateRange(years, months, days);
		TimeRange timeRange = getDurations(duration);
		DateTimeRange dateTimeRange = DateTimeRange.builder().withDateRange(dateRange).withTimeRange(timeRange).build();
		return dateTimeRange;
	}

	public static DateTimeRange getDateTimeRange(Calendar cstart, Calendar cend) {
		if (cend.before(cstart)) {
			throw new RuntimeException("Invalid time range");
		}

		long start = cstart.getTimeInMillis();
		long now = cend.getTimeInMillis();

		long duration = now - start;
		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);

		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);

		long remainingSeconds = remainingMinutes - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSeconds);
		
		Calendar durationStart = Calendar.getInstance();
		durationStart.set(cstart.get(YEAR), cstart.get(MONTH), cstart.get(DAY_OF_MONTH));
		int years = 0;
		int months = 0;
		int dates = 0;
		int addDay = 0;
		long lengthDays = days;
		if(durationStart.get(DAY_OF_MONTH) > 28) {
			addDay = 3;
			durationStart.set(DAY_OF_MONTH, cstart.get(DAY_OF_MONTH) - addDay);
			cstart.set(DAY_OF_MONTH, cstart.get(DAY_OF_MONTH) - addDay);
		}
		for(int i = 0; i < lengthDays; i++) {
			durationStart.add(DAY_OF_MONTH, 1);
			dates ++;
			if(durationStart.get(DAY_OF_MONTH) == cstart.get(DAY_OF_MONTH)) {
				dates = 0;
				months ++;
				if(months == 12) {
					years ++;
					months = 0;
				}
			}
		}
		
		DateRange dateRange = new DateRange(years, months, dates);
		TimeRange timeRange = new TimeRange(hours, minutes, seconds);
		DateTimeRange dateTimeRange = DateTimeRange.builder().withDateRange(dateRange).withTimeRange(timeRange).build();
		return dateTimeRange;
	}
}
