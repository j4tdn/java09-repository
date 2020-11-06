package java07;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.*;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		calculateRelationTime();
	}

	private static void calculateRelationTime() {
		System.out.print("Nhap ngay bat dau hen ho:");
		int startDay = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap thang bat dau hen ho:");
		int startMonth = Integer.parseInt(sc.nextLine());
		System.out.print("Nhap nam bat dau hen ho:");
		int startYear = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap thoi gian bat dau hen ho:");
		System.out.print("Hour:");
		int startHour = Integer.parseInt(sc.nextLine());
		System.out.print("Minute:");
		int startMinute = Integer.parseInt(sc.nextLine());
		System.out.print("Second:");
		int startSecond = Integer.parseInt(sc.nextLine());

		Calendar start = Calendar.getInstance();
		start.set(DAY_OF_MONTH, startDay);
		start.set(MONTH, startMonth - 1);
		start.set(YEAR, startYear);
		start.set(HOUR_OF_DAY, startHour);
		start.set(MINUTE, startMinute);
		start.set(SECOND, startSecond);

		System.out.print("Da chia tay chua?(YES or NO):");
		String isBreakUp = sc.nextLine();
		Calendar end = Calendar.getInstance();
		if (isBreakUp.toLowerCase().equals("yes")) {
			System.out.print("Nhap ngay ket thuc hen ho:");
			int endDay = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap thang ket thuc hen ho:");
			int endMonth = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap nam ket thuc hen ho:");
			int endYear = Integer.parseInt(sc.nextLine());
			System.out.println("Nhap thoi gian ket thuc hen ho:");
			System.out.print("Hour:");
			int endHour = Integer.parseInt(sc.nextLine());
			System.out.print("Minute:");
			int endMinute = Integer.parseInt(sc.nextLine());
			System.out.print("Second:");
			int endSecond = Integer.parseInt(sc.nextLine());

			end.set(DAY_OF_MONTH, endDay);
			end.set(MONTH, endMonth - 1);
			end.set(YEAR, endYear);
			end.set(HOUR_OF_DAY, endHour);
			end.set(MINUTE, endMinute);
			end.set(SECOND, endSecond);
		}

		System.out.println();
		DayOfWeek[] dow = DayOfWeek.values();
		System.out.println("Ngay bat dau hen ho:" + dow[start.get(DAY_OF_WEEK) - 1]);

		if (end.before(start)) {
			throw new RuntimeException("Invalid time range");
		}


		long month =0;
		Calendar tmp = Calendar.getInstance();
		do
		{
			tmp = (Calendar) start.clone();
			tmp.add(MONTH, 1);
			if (tmp.before(end) || tmp.equals(end)) {
				start =tmp;
				month++;
			} else {
				break;
			}
		} while (true);
		long year = month /12;
		month = month % 12;
		long startMillis = start.getTimeInMillis();
		long endMillis = end.getTimeInMillis();
		long duration = endMillis - startMillis;
		long days = TimeUnit.MILLISECONDS.toDays(duration);

		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);

		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
		long minute = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);

		long remainingSecond = remainingMinutes - TimeUnit.MINUTES.toMillis(minute);
		long second = TimeUnit.MILLISECONDS.toSeconds(remainingSecond);
		System.out.println(year +" years " + month +" months " + days +" days " + hours +" hours "+ minute +" minutes " + second +" seconds ");

	}

	public enum DayOfWeek {
		Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
	}
}
