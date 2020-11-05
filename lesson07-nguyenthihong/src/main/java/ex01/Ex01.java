package ex01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import utils.FormatUtils;

public class Ex01 {
	private static final String pattern = "dd/MM/yyyy";

	public static void main(String[] args) {
		getAllSundaysInYear();
		getLastSunday(2020);
	}

	private static void getAllSundaysInYear() {
		LocalDate currentDate = LocalDate.now();
		LocalDate firstDayOfYear = currentDate.with(TemporalAdjusters.firstDayOfYear());
		LocalDate lastDayOfYear = currentDate.with(TemporalAdjusters.lastDayOfYear());
		for (int i = 0; i <= 6; i++) {
			LocalDate date = firstDayOfYear.plusDays(i);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
				do {
					System.out.println(FormatUtils.format(date, pattern));
					date = date.plusDays(7);
				} while (date.isBefore(lastDayOfYear));
				break;
			}
		}
	}

	private static void getLastSunday(int year) {
		LocalDate currentDate = LocalDate.of(year, 1, 1);
		LocalDate lastDayOfYear = currentDate.with(TemporalAdjusters.lastDayOfYear());
		for (int i = 0; i <= 6; i++) {
			LocalDate date = lastDayOfYear.minusDays(i);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
				System.out.println(FormatUtils.format(date, pattern));
				break;
			}
		}
	}

}
