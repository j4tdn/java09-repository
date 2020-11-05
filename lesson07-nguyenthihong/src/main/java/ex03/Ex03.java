package ex03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println(getDetail(LocalDate.of(1995, 9, 25)));
	}

	public static String getDetail(LocalDate ldate) {
		DayOfWeek dayOfWeek = ldate.getDayOfWeek();
		String tittle = ldate.getDayOfMonth() + " " + ldate.getMonth() + " " + ldate.getYear() + " is a " + dayOfWeek;

		int dayOfYear = ldate.getDayOfYear();
		int remainingDays = remainingDays(ldate);
		String line1 = "It is day number " + dayOfYear + " of the year, " + remainingDays + " days left ";

		int currentWeekInYear = (int) ChronoUnit.WEEKS.between(ldate.with(TemporalAdjusters.firstDayOfYear()), ldate)
				+ 1;
		int weekOfYear = (int) ChronoUnit.WEEKS.between(ldate.with(TemporalAdjusters.firstDayOfYear()),
				ldate.with(TemporalAdjusters.lastDayOfYear()));
		String line2 = "It is " + dayOfWeek + " number " + currentWeekInYear + " out of " + weekOfYear + " in "
				+ ldate.getYear();

		int currentWeekInMonth = (int) ChronoUnit.WEEKS.between(ldate.with(TemporalAdjusters.firstDayOfMonth()), ldate)
				+ 1;

		int weekOfMonth = (int) ChronoUnit.WEEKS.between(ldate.with(TemporalAdjusters.firstDayOfMonth()),
				ldate.with(TemporalAdjusters.lastDayOfMonth()));
		String line3 = "It is " + dayOfWeek + " number " + currentWeekInMonth + " out of " + weekOfMonth + " in "
				+ ldate.getMonth() + " " + ldate.getYear();

		String line4 = "Year " + ldate.getYear() + " has " + ldate.lengthOfYear() + " days";

		String line5 = ldate.getMonth() + " " + ldate.getYear() + " has " + ldate.lengthOfMonth();

		return tittle + "\n" + line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5;
	}

	public static int remainingDays(LocalDate ldate) {
		LocalDate lastDayOfYear = ldate.with(TemporalAdjusters.lastDayOfYear());
		int remainingDays = (int) ChronoUnit.DAYS.between(ldate, lastDayOfYear);
		return remainingDays;
	}

}
