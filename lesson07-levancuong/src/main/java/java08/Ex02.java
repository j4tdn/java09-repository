package java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

		LocalDate dStart = LocalDate.of(intStart[2], intStart[1], intStart[0]);

		LocalTime tStart = LocalTime.of(intStart[3], intStart[4], intStart[5]);
		LocalDate dEnd;
		LocalTime tEnd;
		if (check == 1) {
			dEnd = LocalDate.of(intEnd[2], intEnd[1], intEnd[0]);
			tEnd = LocalTime.of(intEnd[3], intEnd[4], intEnd[5]);
		} else {
			dEnd = LocalDate.now();
			tEnd = LocalTime.now();

		}

		long years, months, days, hours, minutes, seconds;
		Period period = Period.between(dStart, dEnd);
		years = period.getYears();
		months = period.getMonths();
		days = period.getDays();

		Duration duration = Duration.between(tStart, tEnd);

		long durations = duration.getSeconds();
		hours = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hours);
		minutes = duration.toMinutes();
		seconds = duration.minusMinutes(minutes).getSeconds();

		System.out.println("time:" + years + "   " + months + "    " + days + "   " + hours + "    " + minutes + "     "
				+ seconds);

	}
}
