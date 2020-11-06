package java08;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.HOUR_OF_DAY;
import static java.util.Calendar.MONTH;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import java07.Ex04.DayOfWeek;

public class Ex04 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("America/New_York"));
	}

	private static String getCurrentTimeNewYork(LocalDateTime now) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return formatter.format(now);
	}

	private static int getDaysOfCurrentmonth(LocalDateTime now) {
		LocalDate tmp = now.toLocalDate();
		tmp = tmp.plusMonths(1);
		tmp = tmp.withDayOfMonth(1);
		tmp = tmp.minusDays(1);
		return tmp.getDayOfMonth();
	}
	
	private static String getLastDayOfMonth (LocalDateTime now) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate tmp = now.toLocalDate();
		tmp = tmp.plusMonths(1);
		tmp = tmp.withDayOfMonth(1);
		tmp = tmp.minusDays(1);
		return formatter.format(tmp);
	}
	
	private static String getLastDayOfWeekCurrent (LocalDateTime now) {
		LocalDate tmp = now.toLocalDate();
	    Calendar ca = Calendar.getInstance();
	    int firstDOW = ca.getFirstDayOfWeek();
	    int lastDOW = (firstDOW == 1) ? 6 : 7;
	    while (tmp.getDayOfWeek().getValue() != lastDOW) {
	    	tmp =tmp.plusDays(1);
	    }
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(tmp);
	}
	
	private static String getFirstDayOfWeekCurrent (LocalDateTime now) {
		LocalDate tmp = now.toLocalDate();
	    Calendar ca = Calendar.getInstance();
	    int firstDOW = (ca.getFirstDayOfWeek() == 1) ? 7 : 1;
	    while (tmp.getDayOfWeek().getValue() != firstDOW) {
	    	tmp =tmp.minusDays(1);
	    }
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(tmp);
	}
	
	private static int getOrderOfWeek(LocalDateTime now) {
		int dayOfYear = now.getDayOfYear();
		return dayOfYear / 7 + ((dayOfYear % 7 == 0) ? 0 : 1);
	}
	
	private static String addHours (LocalDateTime now) {
		LocalDateTime tmp = now.plusHours(8);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return formatter.format(tmp);
	}
	
	private static void distanceTime (LocalDateTime start, LocalDateTime end) {
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();	
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		Period period = Period.between(dateStart, dateEnd);
		
		
		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				
				int previousMonth = dateEnd.getMonthValue() -1;
				int year = dateEnd.getYear();
				int days = YearMonth.of(year, previousMonth).lengthOfMonth() -1;
				period = period.withDays(days);
				if (period.getMonths() < 0 ) {
					period = period.minusYears(1);
					period = period.withMonths(11);
				} 
			}
		}
		System.out.println("Distance is " + period.getYears() + " years " + period.getMonths() + " months");
	}
	
	private static String add20Days (LocalDateTime now) {
		LocalDate tmp = now.toLocalDate();
		tmp = tmp.plusDays(20);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return formatter.format(tmp) + " " + tmp.getDayOfWeek();
	}
	
	private static int remainMonth (LocalDateTime now) {
		return 12 - now.getMonthValue();
	}
	
	private static void getAge (LocalDateTime start, LocalDateTime end) {
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();	
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		Period period = Period.between(dateStart, dateEnd);
		
		
		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);
			if (period.getDays() < 0) {
				period = period.minusMonths(1);
				
				int previousMonth = dateEnd.getMonthValue() -1;
				int year = dateEnd.getYear();
				int days = YearMonth.of(year, previousMonth).lengthOfMonth() -1;
				period = period.withDays(days);
				if (period.getMonths() < 0 ) {
					period = period.minusYears(1);
					period = period.withMonths(11);
				} 
			}
		}
		
		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();
		System.out.println("Age:" + years + " years " + months + " months " + days);
	}
	
}
