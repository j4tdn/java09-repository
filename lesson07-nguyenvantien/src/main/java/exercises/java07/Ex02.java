package exercises.java07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import common.DateTimeRange;
import utils.DateUtils;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String pattern = "dd/MM/yyyy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);

		Calendar start;
		Calendar end = null;
		
		while (true) {
			System.out.println("Nhập ngày bắt đầu: ");
			while (true) {
				try {
					start = input(df);
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Nhập lại(dd/MM/yyyy HH:mm:ss): ");
				}
			}
			System.out.println("Chia tay nhập 1, nếu chưa nhập ngẫu nhiên: ");
			String check = scanner.nextLine();
			if (!check.equals("1")) {
				end = Calendar.getInstance();
			} else {
				System.out.println("Nhập ngày kết thúc: ");
			}

			while (check.equals("1")) {
				try {
					end = input(df);
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("Nhập lại(dd/MM/yyyy HH:mm:ss): ");
				}
			}

			break;
		}
		
		System.out.println(DateUtils.getDayOfWeek(start.get(Calendar.DAY_OF_WEEK)));
		
		System.out.println(df.format(start.getTime()));
		System.out.println(df.format(end.getTime()));
		DateTimeRange dateTimeRange = DateUtils.getDateTimeRange(start, end);
		System.out.println(dateTimeRange.toString());

		
	}

	private static Calendar input(DateFormat dateFormat) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String dT = scanner.nextLine();
		Date date = dateFormat.parse(dT);
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTime(date);
		return dateTime;
	}

}
