package exercises.java08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Ex01 {
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	public static void main(String[] args) {
		getAllSundaysInYear();
		getLastSunday();
	}

	private static void getLastSunday() {
		System.out.println("=== In ra thông tin ngày chủ nhật cuối cùng trong năm ===");
		LocalDate ldate = LocalDate.now().withMonth(12).withDayOfMonth(31);
		ldate = ldate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
		System.out.println(formatter.format(ldate));
	}

	private static void getAllSundaysInYear() {
		System.out.println("=== In ra thông tin các ngày chủ nhật trong năm ===");
		LocalDate ldate = LocalDate.now().withDayOfMonth(1).withMonth(1);
		int curYear = ldate.getYear();
		ldate = ldate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		
		while(ldate.getYear() == curYear) {
			System.out.println(formatter.format(ldate));
			ldate = ldate.plusDays(7);
		}
	}
}
