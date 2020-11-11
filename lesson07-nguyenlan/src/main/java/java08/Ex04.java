package java08;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;


public class Ex04 {

	private static String datePattern = "dd/MM/yyyy";
	private static String dateTimePattern = "dd/MM/yyyy HH:mm:ss";
	private static SimpleDateFormat formatter = new SimpleDateFormat();
	private static DateTimeFormatter dtFormatter;

	public static void main(String[] args) {
		p1();
		p2();
		p3();
		p4();
		p5();
		p6();
		p7();
		p8();
		p9();
		p10();
	}

	private static void p1() {
		System.out.println("1.Thời gian hiện tại ở New York");

		Calendar calendar = Calendar.getInstance(Locale.US);
        TimeZone americaTimeZone=TimeZone.getTimeZone("America/New_York");
		calendar.setTimeZone(americaTimeZone);
		formatter.applyPattern(dateTimePattern);
		formatter.setTimeZone(americaTimeZone);
		System.out.println(formatter.format(calendar.getTime()));
	}

	private static void p2() {
		System.out.println("2.Kiểm tra tháng hiện tại có bao nhiêu ngày");
		System.out.println(YearMonth.now().lengthOfMonth());
	}

	private static void p3() {
		System.out.println("3.In ngày cuối cùng của tháng hiện tại");
		LocalDate date = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		dtFormatter = DateTimeFormatter.ofPattern(datePattern);
		System.out.println(dtFormatter.format(date));
	}

	private static void p4() {
		System.out.println("4.Xem ngày đầu tiên và cuối cùng của tuần hiện tại");
		LocalDate date = LocalDate.now();
		dtFormatter = DateTimeFormatter.ofPattern(datePattern);
		date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
		System.out.println(dtFormatter.format(date));
		date = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println(dtFormatter.format(date));
	}

	private static void p5() {
		System.out.println("5.Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
		int count = 1;
		LocalDate date = LocalDate.now();
		int curYear = date.getYear();
		date = date.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		while (date.getYear() == curYear) {
			date = date.minusDays(7);
			count++;
		}
		System.out.println(count);
	}

	private static void p6() {
		System.out.println("6. Thêm 8 tiếng vào thời gian hiện tại và in ra");
		LocalDateTime ldt = LocalDateTime.now();
		dtFormatter = DateTimeFormatter.ofPattern(dateTimePattern);
		ldt = ldt.plusHours(8);
		System.out.println(dtFormatter.format(ldt));
	}

	private static void p7() {
		System.out.println("7. Kiểm tra khoảng cách giữa 2 mốc thời gian là bao nhiêu năm, tháng");
		LocalDateTime ldtStart = LocalDateTime.of(2009, 12, 20, 8, 7, 39);
		LocalDateTime ldtEnd = LocalDateTime.now();

		long years = ldtStart.until(ldtEnd, ChronoUnit.YEARS);
		ldtStart = ldtStart.plusYears( years );
		long months = ldtStart.until(ldtEnd, ChronoUnit.MONTHS );

		System.out.println("year: " + years
							+ ", month: " + months);
	}

	private static void p8() {
		System.out.println("8. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy");
		LocalDate ldate = LocalDate.now().plusDays(20);
		dtFormatter = DateTimeFormatter.ofPattern(datePattern);
		System.out.println(dtFormatter.format(ldate));
	}

	private static void p9() {
		System.out.println("9. Kiểm tra số tháng còn lại trong năm từ thời điểm hiện tại ");
		LocalDate ldate = LocalDate.now();
		LocalDate ldateEnd = LocalDate.of(ldate.getYear(), Month.DECEMBER, 31);
		Period period = Period.between(ldate, ldateEnd);
		System.out.println(period.getMonths());
	}

	private static void p10() {
		System.out.println("10.Tính tuổi của bạn. Bao nhiêu năm, tháng, ngày ");
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập ngày tháng năm sinh của bạn: ");
		System.out.println("ngày: ");
		int day = Integer.parseInt(ip.nextLine());
		System.out.println("tháng: ");
		int month = Integer.parseInt(ip.nextLine());
		System.out.println("năm: ");
		int year = Integer.parseInt(ip.nextLine());
		
		LocalDate ldate = LocalDate.of(year, month, day);
		LocalDate now = LocalDate.now();
		Period period = Period.between(ldate, now);
		System.out.println("years: " + period.getYears() 
						+ ", months: " + period.getMonths() 
						+ ", days: " + period.getDays());
	}
}
