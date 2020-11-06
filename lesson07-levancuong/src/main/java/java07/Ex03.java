package java07;

import java.util.Calendar;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int day, month, year;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Nhap ngay:");
			day = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap thang:");
			month = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap nam:");
			year = Integer.parseInt(sc.nextLine());
			if (!isValidDate(day, month, year)) {
				System.out.println("Invalid day,please enter again!!");
			} else {
				break;
			}

		} while (true);

		month -= 1;

		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int theRestDayOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear;
		System.out.println("It's day number " + dayOfYear + ", the rest day of year " + theRestDayOfYear);

		int numberOfMonday = 0;
		int sum = 0;
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		for (int d = 1; d <= c.getActualMaximum(Calendar.DAY_OF_YEAR); d++) {
			cal.set(Calendar.DAY_OF_YEAR, d);
			if (cal.get(Calendar.DAY_OF_WEEK) == 2 && d <= c.get(Calendar.DAY_OF_YEAR)) {
				numberOfMonday++;
			}
			if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
				sum++;
			}
		}
		System.out.println("it is monday number " + numberOfMonday + " of " + sum);

		cal.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1);
		int numberMondayOfMonth = 0;
		int sumofMonth = 0;
		for (int d = 1; d <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); d++) {
			cal.set((Calendar.DAY_OF_MONTH), d);
			if (cal.get(Calendar.DAY_OF_WEEK) == 2) {
				sumofMonth++;
				if (d <= c.get(Calendar.DAY_OF_MONTH)) {
					numberMondayOfMonth++;
				}
			}
		}
		System.out.println("it is monday number " + numberMondayOfMonth + " of month  " + (c.get(Calendar.MONTH) + 1)
				+ "is " + sumofMonth);

		System.out.println("year " + c.get(Calendar.YEAR) + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out
				.println("month " + (c.get(Calendar.MONTH) + 1) + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH));

	}

	private static boolean isValidDate(int day, int month, int year) {
		if (year <= 0) {
			return false;
		}
		if (month < 1 || month > 12) {
			return false;
		}

		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30) {
				return false;
			}
		} else {
			if (month == 2) {
				if (isLeapYear(year)) {
					if (day < 1 || day > 29) {
						return false;
					}
				} else {
					if (day < 1 || day > 28) {
						return false;
					}
				}
			} else {
				if (day < 1 || day > 31) {
					return false;
				}
			}
		}
		return true;
	}

	private static boolean isLeapYear(int year) {
		return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

}
