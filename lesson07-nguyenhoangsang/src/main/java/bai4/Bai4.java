package bai4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Bai4 {
	public static void main(String[] args) {
		timeInNewYork();
		checkNumberOfDaysInMonth();
		LastDayOfMonth();
		printFirstAndLastDayOfWeek();
		getArrangementOfWeekInYear();
		plus8Hours();
//		checkPeriod();
		plus20Days();
		numberOfRemainingMonthsOfYear();
		calculateMyAge();
	}

	public static void timeInNewYork() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Calendar c = Calendar.getInstance(Locale.US);

		int date = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);

		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println("1.Thời gian ở NewYork là : " + date + "/" + (month + 1) + "/" + year + " " + hour + ":"
				+ minute + ":" + second);
	}

	public static void checkNumberOfDaysInMonth() {
		Calendar c = Calendar.getInstance();
		int dayOfMonth = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("2.Số ngày trong tháng này là : " + dayOfMonth);
	}

	public static void LastDayOfMonth() {
		LocalDate ld = LocalDate.now();
		int month = ld.getMonthValue();
		int year = ld.getYear();
		int day = Calendar.getInstance().getMaximum(Calendar.DAY_OF_MONTH);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate result = LocalDate.parse(day + "/" + month + "/" + year, dateTimeFormatter);
		System.out.println("3.Ngày cuối cùng của tháng là : " + result);
	}

	public static void printFirstAndLastDayOfWeek() {
		LocalDate date = LocalDate.now();
		LocalDate startOfWeek = date.minusDays(date.getDayOfWeek().getValue());
		System.out.println("4.Ngày đầu tiên của tuần là : " + startOfWeek);

		LocalDate endOfWeek = date.plusDays(6 - date.getDayOfWeek().getValue());
		System.out.println("4.Ngày cuối cùng của tuần là : " + endOfWeek);

	}
//	public enum DaysInWeek {
//	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
//}
	
	public static void getArrangementOfWeekInYear() {
		LocalDate ld = LocalDate.now();
		int num = ld.getDayOfWeek().getValue();
		
		LocalDate start = LocalDate.of(2020, 1, 1);
		LocalDate end = LocalDate.now();
		
		int countWeeks = 1;
		while(true) {
			start = start.plusDays(1);
			if (start.getDayOfWeek().getValue() == num) {
				countWeeks++;
			}
			if (String.valueOf(start).equals(String.valueOf(end))) {
				break;
			}
		}

		System.out.println("5.Đây là tuần thứ " + countWeeks
				+ " trong năm !" );
	}
	
	public static void plus8Hours() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime ld = LocalDateTime.now();
		ld = ld.plusHours(8);
		System.out.println("6.Sau khi thêm 8 tiếng thì thời gian là :" + ld.format(formatter));
	}
	public static void checkPeriod() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập mốc thời gian thứ nhất : ");
		System.out.print("Nhập ngày:");
		String day = ip.nextLine();
		
		System.out.print("Nhập tháng:");
		String month = ip.nextLine();
		
		
		System.out.print("Nhập năm:");
		String year = ip.nextLine();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateString = day + "/" + month + "/" + year;
		LocalDate date = LocalDate.parse(dateString,dateTimeFormatter);
		
		
		System.out.println("Nhập mốc thời gian thứ hai : ");
		System.out.print("Nhập ngày:");
		String day2 = ip.nextLine();
		
		System.out.print("Nhập tháng:");
		String month2 = ip.nextLine();
		
		
		System.out.print("Nhập năm:");
		String year2 = ip.nextLine();

		String dateString2 = day2 + "/" + month2 + "/" + year2;
		LocalDate date2 = LocalDate.parse(dateString2,dateTimeFormatter);
		
		Period period = Period.between(date, date2);
		
		int monthResult = period.getMonths();
		int yearResult = period.getYears();
		
		System.out.println("7.Khoảng cách giữa  " + date + " và " + date2 + " là "  + yearResult + " năm và " + monthResult + " tháng!");
	}
	
	public static void plus20Days() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime ld = LocalDateTime.now();
		ld = ld.plusDays(20);
		System.out.println("8.Sau khi thêm 20 ngày thì thời gian là :" + ld.format(formatter) + " và là thứ " + ld.getDayOfWeek());
	}
	public static void numberOfRemainingMonthsOfYear() {
		LocalDate ld = LocalDate.now();
		int count = 0;
		while(true) {
			LocalDate ld1 = ld.plusMonths(1);
			if (ld1.getMonth().getValue() <= 12) {
				count ++;
				if (ld1.getMonth().getValue() == 12) {
					break;
				}
			} 
		}
		System.out.println("9.Số tháng còn lại của năm là : " + count);
	}
	public static void calculateMyAge() {
		LocalDate start = LocalDate.of(1999, 3, 8);
		LocalDate end = LocalDate.now();
		
		Period period = Period.between(start, end);
		
		int monthResult = period.getMonths();
		int yearResult = period.getYears();
		int dayResult = period.getDays();
		
		System.out.println("10.Hiện tại mình(Sang) được " + yearResult + " tuổi, " + monthResult + " tháng và "  + dayResult + " ngày!");
	}
}