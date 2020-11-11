package java07;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import common.DayOfWeek;

import static java.util.Calendar.*;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		calculateRelationTime();
	}

	private static void calculateRelationTime() {
		System.out.println("NHẬP MỐC THỜI GIAN BẮT ĐẦU HẸN HÒ: ");
		System.out.println("ngày: ");
		int startDay = Integer.parseInt(ip.nextLine());
		System.out.print("tháng: ");
		int startMonth = Integer.parseInt(ip.nextLine());
		System.out.print("năm: ");
		int startYear = Integer.parseInt(ip.nextLine());
		System.out.print("giờ: ");
		int startHour = Integer.parseInt(ip.nextLine());
		System.out.print("phút: ");
		int startMinute = Integer.parseInt(ip.nextLine());
		System.out.print("giây: ");
		int startSecond = Integer.parseInt(ip.nextLine());

		Calendar start = Calendar.getInstance();
		start.set(DAY_OF_MONTH, startDay);
		start.set(MONTH, startMonth - 1);
		start.set(YEAR, startYear);
		start.set(HOUR_OF_DAY, startHour);
		start.set(MINUTE, startMinute);
		start.set(SECOND, startSecond);

		System.out.print("Đã chia tay chưa?(YES or NO):");
		String isBreakUp = ip.nextLine();
		Calendar end = Calendar.getInstance();
		if (isBreakUp.toLowerCase().equals("yes")) {
			System.out.println("NHẬP MỐC THỜI GIAN CHIA TAY: ");
			System.out.print("ngày: ");
			int endDay = Integer.parseInt(ip.nextLine());
			System.out.print("tháng: ");
			int endMonth = Integer.parseInt(ip.nextLine());
			System.out.print("năm: ");
			int endYear = Integer.parseInt(ip.nextLine());
			System.out.print("giờ: ");
			int endHour = Integer.parseInt(ip.nextLine());
			System.out.print("phút: ");
			int endMinute = Integer.parseInt(ip.nextLine());
			System.out.print("giây: ");
			int endSecond = Integer.parseInt(ip.nextLine());

			end.set(DAY_OF_MONTH, endDay);
			end.set(MONTH, endMonth - 1);
			end.set(YEAR, endYear);
			end.set(HOUR_OF_DAY, endHour);
			end.set(MINUTE, endMinute);
			end.set(SECOND, endSecond);
		}

		DayOfWeek[] dow = DayOfWeek.values();
		System.out.println("\nNgày bắt đầu hẹn hò: " + dow[start.get(DAY_OF_WEEK) - 1]);

		if (end.before(start)) {
			throw new RuntimeException("Invalid time range");
		}

		long month = 0;
		Calendar tmp = Calendar.getInstance();
		do {
			tmp = (Calendar) start.clone();
			tmp.add(MONTH, 1);
			if (tmp.before(end) || tmp.equals(end)) {
				start = tmp;
				month++;
			} else {
				break;
			}
		} while (true);
		long year = month / 12;
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
		System.out.println(year + " years, " + month + " months, " + days + " days, " + hours + " hours, " + minute
				+ " minutes, " + second + " seconds. ");

	}
}
