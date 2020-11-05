package ex02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import utils.DateUtils;
import utils.FormatUtils;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	private static final String pattern = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		/*
		 * LocalDateTime start = LocalDateTime.of(2020, 11, 5, 10, 18, 00);
		 * LocalDateTime end = LocalDateTime.of(2020, 11, 5, 11, 18, 00);
		 * System.out.println(DateUtils.getDateTimeRange(start, end));
		 */

		System.out.println("Nhập ngày bắt đầu hẹn hò");
		LocalDateTime start = inputLocalDateTime();
		System.out.println("Nhập 1 nếu đã chia tay, nhập 0 nếu chưa chia tay? ");
		int isBroken = Integer.parseInt(sc.nextLine());
		if (isBroken == 1) {
			System.out.println("Nhập ngày chia tay");
			LocalDateTime end = inputLocalDateTime();
			System.out.println("Đã yêu được: " + DateUtils.getDateTimeRange(start, end));
		} else {
			System.out.println("Đã yêu được: " + DateUtils.getDateTimeRange(start, LocalDateTime.now()));
		}

	}

	public static LocalDateTime inputLocalDateTime() {
		String datetime = sc.nextLine();
		return FormatUtils.formatDateTime(datetime, pattern);
	}

	public static DayOfWeek getDayOfWeek(LocalDateTime ldatetime) {
		LocalDate date = ldatetime.toLocalDate();
		return date.getDayOfWeek();
	}

}
