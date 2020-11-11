package java08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Ex01 {
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	public static void main(String[] args) {
		getAllSundaysInYear();
		getLastSunday(2020);
	}

	private static void getLastSunday(int year) {
		System.out.println("NGÀY CHỦ NHẬT CUỐI CÙNG TRONG NĂM");
		LocalDate ldate = LocalDate.now();
		ldate = ldate.withYear(year).withMonth(12).withDayOfMonth(31);
		ldate = ldate.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
		System.out.println(formatter.format(ldate));
	}

	private static void getAllSundaysInYear() {
		System.out.println("THÔNG TIN CÁC NGÀY CHỦ NHẬT TRONG NĂM");
		LocalDate ldate = LocalDate.now().withDayOfMonth(1).withMonth(1);
		int curYear = ldate.getYear();
		ldate = ldate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

		while(ldate.getYear() == curYear) {
			System.out.println(formatter.format(ldate));
			ldate = ldate.plusDays(7);
		}
	}
}