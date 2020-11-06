package bt;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

import static java.time.temporal.TemporalAdjusters.*;
import java.security.DrbgParameters.NextBytes;
import java.time.DayOfWeek;

public class BT4Java8 {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
		method5();
		method6();
		method7();
		method8();
		method9();
		method10();
	}
	
	private static void method1() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("1.Thời gian ở New York là: " + formatter.format(ldt));
	}
	
	private static void method2() {
		LocalDate date = LocalDate.now();
		System.out.println("2.Tháng hiện tại có số ngày là: " + date.lengthOfMonth());
	}
	
	private static void method3() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		int day = date.lengthOfMonth();
		date = date.withDayOfMonth(day);
		System.out.println("3.Ngày cuối cùng của tháng hiện tại: " + formatter.format(date));
	}
	
	private static void method4() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		if (date.getDayOfWeek() != DayOfWeek.MONDAY) {
			date = date.with(next(DayOfWeek.MONDAY));
		}
		date = date.minusDays(7);
		System.out.println("4.Ngày đầu tiên của tuần là: " + formatter.format(date));
		date = date.plusDays(6);
		System.out.println(" Ngày cuối cùng của tuần là: " + formatter.format(date));
	}
	
	private static void method5() {
		LocalDate date = LocalDate.now();
		LocalDate start = date.with(firstDayOfYear());
		if (start.getDayOfWeek() != DayOfWeek.MONDAY) {
			start = start.with(next(DayOfWeek.MONDAY));
		}
		if (date.getDayOfWeek() != DayOfWeek.MONDAY) {
			date = date.with(next(DayOfWeek.MONDAY));
		}
		date = date.minusDays(7);
		int week = (date.getDayOfYear() - start.getDayOfYear())/7 + 1;
		System.out.println("5.Tuần thứ mấy trong năm: " + week);
	}
	
	private static void method6() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		now = now.plusHours(8);
		System.out.println("6.Sau khi thêm 8 tiếng vào thời gian hiện tại: " + formatter.format(now));
	}
	
	private static void method7() {
		LocalDate start = LocalDate.of(2020, Month.JANUARY, 20);
		LocalDate end = LocalDate.of(2020, Month.DECEMBER, 1);
		Period period = Period.between(start, end);
		int years = period.getYears();
		int months = period.getMonths();
		System.out.println("7.Khoảng cách: " + years + " năm, " + months + " tháng.");
	}
	
	private static void method8() {
		LocalDateTime now = LocalDateTime.now();
		now = now.plusDays(20);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
		System.out.println("8.20 ngày nữa là ngày: " + formatter.format(now));
	}
	
	private static void method9() {
		LocalDate now = LocalDate.now();
		LocalDate end = LocalDate.of(now.getYear(), Month.DECEMBER, 31);
		int monthsLeft = Period.between(now, end).getMonths();
		System.out.println("9.Số tháng còn lại của năm: " + monthsLeft);
	}
	
	private static void method10() {
		LocalDate now = LocalDate.now();
		LocalDate start = LocalDate.of(2000, Month.AUGUST, 20);
		Period period = Period.between(start, now);
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		System.out.println("10.Tuổi của tôi: " + years + " năm, " + months + " tháng, " + days + " ngày.");
	}
}
