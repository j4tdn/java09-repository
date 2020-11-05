package exercises.java08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import common.DateTimeRange;
import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		LocalDateTime start = null;
		LocalDateTime end = null;
		
		while (true) {
			System.out.println("Nhập ngày bắt đầu: ");
			while (true) {
				try {
					start = input(formatter);
					break;
				} catch (DateTimeParseException e) {
					// TODO Auto-generated catch block
					System.out.println("Nhập lại(dd/MM/yyyy HH:mm:ss): ");
				}
			}
			System.out.println("Chia tay nhập 1, nếu chưa nhập ngẫu nhiên: ");
			String check = scanner.nextLine();
			if (!check.equals("1")) {
				end = LocalDateTime.now();
			} else {
				System.out.println("Nhập ngày kết thúc: ");
			}

			while (check.equals("1")) {
				try {
					end = input(formatter);
					break;
				} catch (DateTimeParseException e) {
					// TODO Auto-generated catch block
					System.out.println("Nhập lại(dd/MM/yyyy HH:mm:ss): ");
				}
			}
			if(end.isBefore(start)) {
				System.out.println("Nhập lại tất cả: ");
			}else {
				break;
			}
		}

//		LocalDateTime end = LocalDateTime.parse("29/04/2020 10:20:30", formatter);

		System.out.println(start.getDayOfWeek());

		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(start, end);
		System.out.println(dateTimeRange);
	}

	private static LocalDateTime input(DateTimeFormatter formatter) throws DateTimeParseException {
		Scanner scanner = new Scanner(System.in);
		String dT = scanner.nextLine();
		LocalDateTime dateTime = LocalDateTime.parse(dT, formatter);
		return dateTime;
	}

}
