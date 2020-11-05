package exercises.java08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import common.DateRange;
import common.DateTimeRange;
import common.DateTimeRange.Builder;
import common.TimeRange;

public class Ex02 {
	public static void main(String[] args) {
		String startDateString = "01/04/2020 10:02:39";
		String endDateString = "09/02/2021 08:25:40";
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		if(endDateString.isEmpty()) {
			Calendar c = Calendar.getInstance();
			endDateString = formatter.format(c.getTime());
		}
		
		LocalDateTime ldtStart = null;
		LocalDateTime ldtEnd = null;
		try {
			ldtStart = convertToLocaldateTime(formatter.parse(startDateString));
			ldtEnd = convertToLocaldateTime(formatter.parse(endDateString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		getDOWStartDate(ldtStart);
		DateTimeRange dateTimeRange = getDateTimeRange(ldtStart, ldtEnd);
		System.out.println("Time range they fell in love: \n" + dateTimeRange);
	}
	
	private static void getDOWStartDate(LocalDateTime ldt) {
		System.out.print("DOW of start date: ");
		LocalDate ldate = ldt.toLocalDate();
		System.out.println(ldate.getDayOfWeek());
	}

	private static LocalDateTime convertToLocaldateTime(Date date) {
		return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
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
		long hours = duration.toHours();
		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();
		long seconds = duration.minusMinutes(minutes).toSeconds();	
		TimeRange timeRange = new TimeRange(hours, minutes, seconds);
		
		Builder builder = DateTimeRange.builder()
				.withDateRange(dateRange)
				.withTimeRange(timeRange);
		dateTimeRange = builder.build();
		
		return dateTimeRange;
	}
}
