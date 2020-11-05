package exercises.java07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import common.DateTimeRange;
import utils.DateUtils;
import utils.Format;

import static java.util.Calendar.*;

public class Ex04 {
	public static void main(String[] args) {
		showTimeInNewYork();
		showDayNumberOfMonthNow();
		showLastDateOfMonthNow();
		showFirstDateAndLastDateOfWeekNow();
		showWeekNowOfYear();
		showTimeAfterNHour(8);
		Calendar c = Calendar.getInstance();
		c.set(2021, 3, 29);
		betweenOfDate(Calendar.getInstance(), c);
		showDateAfterNDay(20);
		showNumberOfMonthsRemain();
		c.set(2000, 3, 30);
		showBirthdayOfYou(c);
	}
	
	private static void showTimeInNewYork() {
		Calendar cdate = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		System.out.println(Format.getDateFormat(cdate));
	}
	
	private static void showDayNumberOfMonthNow() {
		System.out.println(Calendar.getInstance().getActualMaximum(DAY_OF_MONTH));
	}
	
	private static void showLastDateOfMonthNow() {
		Calendar date = Calendar.getInstance(new Locale("vi", "VN"));
		date.set(DAY_OF_MONTH, date.getActualMaximum(DAY_OF_MONTH));
		System.out.println(Format.getDateFormat(date));
	}
	
	private static void showFirstDateAndLastDateOfWeekNow() {
		Calendar date = Calendar.getInstance(new Locale("vi", "VN"));
		date.set(DAY_OF_MONTH, 8);
		
		int fdow = date.get(DAY_OF_MONTH) - date.get(DAY_OF_WEEK) 
						+ Calendar.getInstance().getFirstDayOfWeek() + 1;
		
		while(date.get(DAY_OF_WEEK) != fdow) {
			if((date.get(DAY_OF_WEEK) == 1) && (date.get(DAY_OF_WEEK) !=fdow)) {
				date.add(DAY_OF_MONTH, -6);
				break;
			}
			date.add(DAY_OF_MONTH, -1);
		}
		Calendar firstDate = Calendar.getInstance();
		firstDate.set(date.get(YEAR), date.get(MONTH), date.get(DAY_OF_MONTH));
		
		Calendar lastDate = Calendar.getInstance();
		lastDate.set(firstDate.get(YEAR), firstDate.get(MONTH), firstDate.get(DATE));
		lastDate.add(DAY_OF_MONTH, 6);
		System.out.println(Format.getDateFormat(firstDate) + "--" + Format.getDateFormat(lastDate));
	}
	
	private static void showWeekNowOfYear() {
//		LocalDate date = LocalDate.now();
		Calendar date = Calendar.getInstance();
		int weeks = date.get(DAY_OF_YEAR) / 7;
		weeks = (date.get(DAY_OF_YEAR) % 7 == 0) ? weeks : weeks + 1;
		System.out.println(weeks);
	}
	
	private static void showTimeAfterNHour(int hours) {
//		LocalDateTime dateTime = LocalDateTime.now();
		Calendar dateTime = Calendar.getInstance();
//		System.out.println(dateTime);
		Calendar timePlus = Calendar.getInstance();
		timePlus.set(HOUR_OF_DAY, dateTime.get(HOUR_OF_DAY) + hours);
		
		System.out.println(Format.getDateFormat(timePlus));
	}
	
	private static void betweenOfDate(Calendar date1, Calendar date2) {
		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(date1, date2);
		System.out.println(dateTimeRange.getDateRange().getMonths() +" Month "
						+ dateTimeRange.getDateRange().getYears() + " Year");
	}
	
	private static void showDateAfterNDay(int days) {
		Calendar date = Calendar.getInstance();
		 date.add(DAY_OF_MONTH, days);
		System.out.println("Day: " + date.get(DAY_OF_MONTH) + "-" + DateUtils.getDayOfWeek(date.get(DAY_OF_WEEK)));
	}
	
	private static void showNumberOfMonthsRemain() {
		System.out.println(12 - Calendar.getInstance().get(MONTH) - 1);
	}
	
	private static void showBirthdayOfYou(Calendar birthday) {
		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(birthday, Calendar.getInstance());
		System.out.println(dateTimeRange.getDateRange().getYears() + "-" 
						+ dateTimeRange.getDateRange().getMonths() + "-"
						+ dateTimeRange.getDateRange().getDays());
	}
}
