package java07;

import java.util.Calendar;
import java.util.Scanner;

import common.DayOfWeek;

import static java.util.Calendar.*;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner ip = new Scanner(System.in);
		System.out.println("Day: ");
		int day =Integer.parseInt(ip.nextLine());
		System.out.println("Month: ");
		int month = Integer.parseInt(ip.nextLine());
		System.out.println("Year: ");
		int year = Integer.parseInt(ip.nextLine());
		DayOfWeek[] dayOfWeek = DayOfWeek.values();

		c.set(year, month - 1, day, 0, 0, 0);
		c.set(MILLISECOND, 0);

		System.out.println("It is day number " + c.get(DAY_OF_YEAR) + " of the year, "
				+ (c.getActualMaximum(DAY_OF_YEAR) - c.get(DAY_OF_YEAR)) + " days left");

		int dow = c.get(DAY_OF_WEEK);
		Calendar startYear = Calendar.getInstance();
		startYear.set(year, 0, 1, 0, 0, 0);
		startYear.set(MILLISECOND, 0);
		Calendar endYear = Calendar.getInstance();
		endYear.set(year, 11, 31, 0, 0, 0);
		endYear.set(MILLISECOND, 0);

		long differenceWeeks = getDifferenceWeeks(startYear, c, dow);
		long totalDifferenceWeeks = getDifferenceWeeks(startYear, endYear, dow);

		System.out.println("It is " + dayOfWeek[dow - 1] + " number " + (differenceWeeks + 1) + " out of "
				+ (totalDifferenceWeeks + 1) + " in " + c.get(YEAR));

		Calendar startMonth = Calendar.getInstance();
		startMonth.set(year, month, 1, 0, 0, 0);
		startMonth.set(MILLISECOND, 0);
		Calendar endMonth = Calendar.getInstance();
		endMonth.set(year, month, c.getActualMaximum(DAY_OF_MONTH), 0, 0, 0);
		endMonth.set(MILLISECOND, 0);

		differenceWeeks = getDifferenceWeeks(startMonth, c, dow);
		totalDifferenceWeeks = getDifferenceWeeks(startMonth, endMonth, dow);

		System.out.println("It is " + dayOfWeek[dow - 1] + " number " + (differenceWeeks + 1) + " out of "
				+ (totalDifferenceWeeks + 1) + " in month " + (c.get(MONTH) + 1));

		System.out.println("Year " + c.get(YEAR) + " has " + c.getActualMaximum(DAY_OF_YEAR) + " days");

		System.out.println("Month " + (c.get(MONTH) + 1) + ", " + c.get(YEAR) + " has "
				+ c.getActualMaximum(DAY_OF_MONTH) + " days");
	}

	private static long getDifferenceWeeks(Calendar start, Calendar end, int dow) {
		while (start.get(DAY_OF_WEEK) != dow) {
			start.add(DAY_OF_MONTH, 1);
		}
		while (end.get(DAY_OF_WEEK) != dow) {
			end.add(DAY_OF_MONTH, -1);
		}

		return (end.getTimeInMillis() - start.getTimeInMillis()) / (1000 * 60 * 60 * 24 * 7);
	}
}
