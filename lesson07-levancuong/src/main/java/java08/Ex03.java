package java08;

import java.time.DayOfWeek;
import java.time.LocalDate;
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

		LocalDate lDate = LocalDate.of(year, month, day);
		System.out.println("it is day number " + lDate.getDayOfYear() + " of the year,the rest day is "
				+ (lDate.lengthOfYear() - lDate.getDayOfYear()));

		LocalDate localDate = LocalDate.of(year, month, day);
		int count = 0;
		int sum = 0;
		for (int d = 1; d <= localDate.lengthOfYear(); d++) {
			localDate = localDate.withDayOfYear(d);
			if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
				sum++;
				if (d <= lDate.getDayOfYear()) {
					count++;
				}
			}
		}
		System.out.println("it is week number " + count + " in " + sum);
		int count1 = 0;
		int sum1 = 0;
		localDate = localDate.of(year, month, day);
		for (int d = 1; d <= localDate.lengthOfMonth(); d++) {
			localDate = localDate.withDayOfMonth(d);
			if (localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
				sum1++;
				if (d <= lDate.getDayOfMonth()) {
					count1++;
				}
			}
		}

		System.out.println("it is Monday number " + count1 + " in " + sum1);

		System.out.println("year " + lDate.getYear() + " Has " + lDate.lengthOfYear() + " day");
		System.out.println("month " + lDate.getMonth() + " has " + lDate.lengthOfMonth() + " day");

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
