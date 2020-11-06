package java07;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String daysStart = "";
		String daysEnd = "";
		System.out.print("Nhap ngay bat dau:(dd MM yyyy hh mm ss):");
		daysStart = sc.nextLine();
		System.out.println("Da chia tay chua:yes ->1 : no ->0");
		int check = Integer.parseInt(sc.nextLine());
		String[] arrEnd = new String[6];
		int[] intEnd = new int[6];
		if (check == 1) {
			System.out.print("Nhap ngay chia tay:(dd MM yyyy hh mm ss):");
			daysEnd = sc.nextLine();
			arrEnd = daysEnd.split(" ");
			intEnd = new int[arrEnd.length];
			for (int i = 0; i < intEnd.length; i++) {
				intEnd[i] = Integer.parseInt(arrEnd[i]);
			}

		}
		String[] arrStart = daysStart.split(" ");
		int[] intStart = new int[arrStart.length];
		for (int i = 0; i < intStart.length; i++) {
			intStart[i] = Integer.parseInt(arrStart[i]);
		}

		Calendar start = Calendar.getInstance();
		start.set(intStart[2], intStart[1] - 1, intStart[0], intStart[3], intStart[4], intStart[5]);

		Calendar end = Calendar.getInstance();
		if (check == 1) {
			end.set(intEnd[2], intEnd[1] - 1, intEnd[0], intEnd[3], intEnd[4], intEnd[5]);
		}
		System.out.println(
				start.get(Calendar.YEAR) + "-" + start.get(Calendar.MONTH) + "-" + start.get(Calendar.DAY_OF_MONTH));
		System.out
				.println(end.get(Calendar.YEAR) + "-" + end.get(Calendar.MONTH) + "-" + end.get(Calendar.DAY_OF_MONTH));

		String[] dows = { "", "Sunday", "Mondau", "Tuesday", "Wednesday", "Thurday", "Friday", "Satuday" };
		System.out.println("ngay bat dau la thu:" + dows[start.get(Calendar.DAY_OF_WEEK)]);

		long timeStart = start.getTimeInMillis();
		long timeEnd = end.getTimeInMillis();
		long duration = timeEnd - timeStart;
		

		long years, months, days, hours, minutes, seconds;
		System.out.println("duration:" + duration);
		years = toYear(duration);
		duration -= years * (3600000 * 24 * 365);
		months = toMonth(duration);
		duration -= months * (3600000 * 24 * 30);
		days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= days * (3600000 * 24);
		hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= hours * (3600000);
		minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= minutes * (60000);
		seconds = duration / 1000;

		System.out.println("The number of days :" + years + "/" + months + "/" + days + "/" + hours + "/" + minutes
				+ "/" + seconds);

	}

	private static int toYear(long duration) {
		return (int) (duration / (3600000 * 24 * 365));
	}

	private static int toMonth(long duration) {
		return (int) (duration / (3600000 * 34 * 30));
	}

}
