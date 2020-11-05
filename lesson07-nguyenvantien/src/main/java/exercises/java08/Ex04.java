package exercises.java08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import utils.Format;

public class Ex04 {
	public static void main(String[] args) {
		showTimeInNewYork();
		showDayNumberOfMonthNow();
		showLastDateOfMonthNow();
		showFirstDateAndLastDateOfWeekNow();
		showWeekNowOfYear();
		showTimeAfterNHour(8);
		betweenOfDate(LocalDate.now(), LocalDate.of(2021, 4, 29));
		showDateAfterNDay(20);
		showNumberOfMonthsRemain();
		showBirthdayOfYou(LocalDate.of(2000, 4, 30));
	}
	
	private static void showTimeInNewYork() {
		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(Format.getDateFormat(localDateTime));
	}
	
	private static void showDayNumberOfMonthNow() {
		System.out.println(LocalDate.now().lengthOfMonth());
	}
	
	private static void showLastDateOfMonthNow() {
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		date = date.withDayOfMonth(date.lengthOfMonth());
		System.out.println(formatter.format(date));
	}
	
	private static void showFirstDateAndLastDateOfWeekNow() {
		LocalDate date = LocalDate.now();
		int fdow = date.getDayOfMonth() - date.getDayOfWeek().getValue()
						+ Calendar.getInstance().getFirstDayOfWeek();
		LocalDate firstDate = date.minusDays(date.getDayOfWeek().getValue() + 1 - fdow);
		LocalDate lastDate = firstDate.plusDays(6);
		System.out.println(firstDate + "--" + lastDate);
	}
	
	private static void showWeekNowOfYear() {
		LocalDate date = LocalDate.now();
		int weeks = date.getDayOfYear() / 7;
		weeks = (date.getDayOfYear() % 7 == 0) ? weeks : weeks + 1;
		System.out.println(weeks);
	}
	
	private static void showTimeAfterNHour(int hours) {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDate date = dateTime.toLocalDate();
		LocalTime time = dateTime.toLocalTime();
		LocalTime timePlus = time.plusHours(hours);
		if(!timePlus.isAfter(time)) {
			date = date.plusDays(1);
		}
		dateTime = LocalDateTime.of(date, timePlus);
		System.out.println(Format.getDateFormat(dateTime));
	}
	
	private static void betweenOfDate(LocalDate date1, LocalDate date2) {
		Period period = Period.between(date1, date2);
		System.out.println(period.getMonths() +" Month " + period.getYears() + " Year");
	}
	
	private static void showDateAfterNDay(int days) {
		LocalDate date = LocalDate.now();
		date = date.plusDays(20);
		System.out.println("Day: " + date.getDayOfMonth() + "-" + date.getDayOfWeek() );
	}
	
	private static void showNumberOfMonthsRemain() {
		System.out.println(12 - LocalDate.now().getMonthValue());
	}
	
	private static void showBirthdayOfYou(LocalDate birthday) {
		Period period = Period.between(birthday, LocalDate.now());
		System.out.println(period.getYears() + "-" + period.getMonths() + "-" + period.getDays());
	}
}
