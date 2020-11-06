package java07;

import java.util.Calendar;
import java.util.Scanner;
import static java.util.Calendar.*;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nhap ngay:");
		int date = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap thang:");
		int month = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap nam:");
		int year = Integer.parseInt(sc.nextLine());

		Calendar ca = Calendar.getInstance();
		ca.set(year, month - 1, date);
		DayOfWeek[] dow = DayOfWeek.values();

		System.out.println(dow[ca.get(DAY_OF_WEEK) - 1]);

		// -----------------------------------------

		System.out.println("It is day number " + ca.get(DAY_OF_YEAR) + " of year,"
				+ (ca.getActualMaximum(DAY_OF_YEAR) - ca.get(DAY_OF_YEAR)) + " days left");

		// ----------------------------------------------

		int firstDayOfYear = getFirstDOWOfMonth(ca.get(DAY_OF_WEEK), 1, ca.get(YEAR));
		int endDayOfYear = getEndDOWOfMonth(ca.get(DAY_OF_WEEK), 12, ca.get(YEAR));
		
		int total = (endDayOfYear - firstDayOfYear) / 7 + 1;
		int nowWeeks = (ca.get(DAY_OF_YEAR) - firstDayOfYear) / 7 + 1;
		System.out.println("It is " + dow[ca.get(DAY_OF_WEEK) - 1] + " number " + nowWeeks + " out of " + total + " in "
				+ ca.get(YEAR));
		
		//---------------------------------------------------------
		
		Month[] months = Month.values();
		int firstWeekDayOfMonth = getFirstDOWOfMonth(ca.get(DAY_OF_WEEK), ca.get(MONTH) +1, ca.get(YEAR));
		int endWeekDayOfMonth = getEndDOWOfMonth(ca.get(DAY_OF_WEEK), ca.get(MONTH) +1, ca.get(YEAR));
		int totalWeekDayOfMonth = (endWeekDayOfMonth - firstWeekDayOfMonth ) /7 +1;
		int nowWeekDayOfMonth = (ca.get(DAY_OF_YEAR) - firstWeekDayOfMonth) / 7 +1;
		System.out.println("It is " + dow[ca.get(DAY_OF_WEEK)-1] + " number " + nowWeekDayOfMonth + 
				                              " out of " + totalWeekDayOfMonth + " in " + months[ca.get(MONTH)] +" " + ca.get(YEAR));

		// ---------------------------------------------------------

		System.out.println("Year " + ca.get(YEAR) + " has " + ca.getActualMaximum(DAY_OF_YEAR) + " days");

		// ---------------------------------------------------------

		
		System.out.println(
				months[ca.get(MONTH)] + " " + ca.get(YEAR) + " has " + ca.getActualMaximum(DAY_OF_MONTH) + " days");
	}
	
	private static int getFirstDOWOfMonth (int dayOfWeek,int month,int year) {
		Calendar tmp = Calendar.getInstance();
		tmp.set(MONTH, month -1);
		tmp.set(DAY_OF_MONTH, 1);
		tmp.set(YEAR, year);
		if (tmp.get(DAY_OF_WEEK) <= dayOfWeek) {
			tmp.add(DAY_OF_MONTH, dayOfWeek - tmp.get(DAY_OF_WEEK));
		} else {
			tmp.add(DAY_OF_MONTH, 7 - tmp.get(DAY_OF_WEEK) + dayOfWeek);
		}

		return tmp.get(DAY_OF_YEAR);
	}
	
	private static int getEndDOWOfMonth (int dayOfWeek,int month,int year) {
		Calendar tmp = Calendar.getInstance();
		tmp.set(MONTH, month -1);
		tmp.set(DAY_OF_MONTH, tmp.getActualMaximum(DAY_OF_MONTH));
		tmp.set(YEAR, year);
		if (tmp.get(DAY_OF_WEEK) >= dayOfWeek) {
			tmp.set(DAY_OF_MONTH, tmp.get(DAY_OF_MONTH) - tmp.get(DAY_OF_WEEK) + dayOfWeek);
		} else {
			tmp.set(DAY_OF_MONTH, tmp.get(DAY_OF_MONTH) - 7 - tmp.get(DAY_OF_WEEK) + dayOfWeek);
		}
		return tmp.get(DAY_OF_YEAR);
		
	}

	public enum DayOfWeek {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}

	public enum Month {
		January, February, March, April, May, June, July, August, September, October, November, December
	}
}
