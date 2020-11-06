package java08;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.DAY_OF_YEAR;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

import java.time.LocalDate;
import java.time.Period;

public class Ex03 {
	public static void main(String[] args) {
		LocalDate inputDate = LocalDate.of(1995, 9, 25);

		System.out.println(inputDate.getDayOfWeek());

		// ---------------------------------------------

		int totalDayInYear = (inputDate.isLeapYear() ? 366 : 365);
		System.out.println("It is day number " + inputDate.getDayOfYear() + " of year,"
				+ (totalDayInYear - inputDate.getDayOfYear()) + " days left");

		// ------------------------------------------------

		int firstDayOfYear = getFirstDOWOfMonth(inputDate.getDayOfWeek().getValue(), 1, inputDate.getYear());
		int endDayOfYear = getLastDOWOfMonth(inputDate.getDayOfWeek().getValue(), 12, inputDate.getYear());
		int total = (endDayOfYear - firstDayOfYear) / 7 + 1;
		int nowWeeks = (inputDate.getDayOfYear() - firstDayOfYear) / 7 + 1;
		System.out.println("It is " + inputDate.getDayOfWeek() + " number " + nowWeeks + " out of " + total + " in "
				+ inputDate.getYear());
		
		// -------------------------------------------------
		
		int firstWeekDayOfMonth = getFirstDOWOfMonth(inputDate.getDayOfWeek().getValue(), inputDate.getMonthValue(), inputDate.getYear());
		int endWeekDayOfMonth = getLastDOWOfMonth(inputDate.getDayOfWeek().getValue(), inputDate.getMonthValue(), inputDate.getYear());
		int totalWeekDayOfMonth = (endWeekDayOfMonth - firstWeekDayOfMonth ) /7 +1;
		int nowWeekDayOfMonth = (inputDate.getDayOfYear() - firstWeekDayOfMonth) / 7 +1;
		System.out.println("It is " + inputDate.getDayOfWeek() + " number " + nowWeekDayOfMonth + 
				                              " out of " + totalWeekDayOfMonth + " in " + inputDate.getMonth() +" " + inputDate.getYear());
		
		// -------------------------------------------------

		System.out.println("Year " + inputDate.getYear() + " has " + totalDayInYear + " days");

		// --------------------------------------------------

		LocalDate tmp = inputDate.withMonth(inputDate.getMonthValue() + 1);
		tmp = tmp.withDayOfMonth(1);
		tmp = tmp.minusDays(1);
		System.out.println(inputDate.getMonth() + " " + inputDate.getYear() + " has " + tmp.getDayOfMonth() + " days");

	}

	private static int getFirstDOWOfMonth(int dayOfWeek, int month, int year) {
		LocalDate date = LocalDate.of(year, month, 1);
		while (date.getDayOfWeek().getValue() != dayOfWeek) {
			date = date.plusDays(1);
		}
		return date.getDayOfYear();
	}

	private static int getLastDOWOfMonth(int dayOfWeek, int month, int year) {
		LocalDate date = LocalDate.of(year, month, 1);
		date = date.plusMonths(1);
		date = date.minusDays(1);
		while (date.getDayOfWeek().getValue() != dayOfWeek) {
			date = date.minusDays(1);
		}
		return date.getDayOfYear();
	}
}
