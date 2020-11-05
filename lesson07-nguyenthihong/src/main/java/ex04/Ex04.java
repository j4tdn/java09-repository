package ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.TimeZone;

import utils.FormatUtils;

public class Ex04 {

	private static final String pattern = "dd/MM/yyy";

	public static void main(String[] args) {

		System.out.println("Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở New York.");
		currentTimeInNewYork();
		System.out.println("Kiểm tra tháng hiện tại có bao nhiêu ngày.");
		dayOfMonth();
		System.out.println("In ngày cuối cùng của tháng hiện tại");
		lastDayOfMonth();
		System.out.println("Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		daysOfWeek();
		System.out.println("Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		weekInYear();
		System.out.println("Thêm 8 tiếng vào thời gian hiện tại và in ra.");
		plusHours();
		System.out.println("Kiểm tra khoảng cách giữa 2 mốc thời gian là bao nhiêu năm, tháng.");
		getPeriod();
		System.out.println("Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		dateAfterPeriod();
		System.out.println("Kiểm tra số tháng còn lại trong năm từ thời điểm hiện tại.");
		remainingMonths();
		System.out.println("Tính tuổi của bạn. Bao nhiêu năm, tháng, ngày.");
		getAge();
	}

	public static void currentTimeInNewYork() {
		String pattern = "dd/MM/yyy HH:mm:ss";
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(timeZone);
		System.out.println(FormatUtils.formatCalendar(calendar, pattern));
	}

	public static void dayOfMonth() {
		LocalDate date = LocalDate.now();
		System.out.println(YearMonth.of(date.getYear(), date.getMonth()).lengthOfMonth());
	}

	public static void lastDayOfMonth() {
		LocalDate date = LocalDate.now();
		date = date.with(TemporalAdjusters.lastDayOfMonth());
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println(FormatUtils.format(date, "dd/MM/yyy") + " - " + dayOfWeek);
	}

	public static void daysOfWeek() {
		LocalDate currentDate = LocalDate.now();
		for (int i = 0; i <= 6; i++) {
			LocalDate date = currentDate.plusDays(i);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
				System.out.println(FormatUtils.format(date, pattern));
				System.out.println(FormatUtils.format(date.minusDays(6), pattern));
			}
		}
	}

	public static void weekInYear() {
		int count = 0;
		LocalDate currentDate = LocalDate.now();
		LocalDate firstDayOfYear = currentDate.with(TemporalAdjusters.firstDayOfYear());
		for (int i = 0; i <= 6; i++) {
			LocalDate date = currentDate.plusDays(i);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			if (dayOfWeek.equals(DayOfWeek.SUNDAY)) {
				while (date.isAfter(firstDayOfYear)) {
					count++;
					date = date.minusDays(7);
				}
				break;
			}
		}
		System.out.println(count);
	}

	public static void plusHours() {
		LocalTime time = LocalTime.now().plusHours(8);
		System.out.println(time);
	}

	private static void getPeriod() {
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.of(1999, 8, 9);
		Period period = Period.between(endDate, startDate);
		int years = period.getYears();
		int months = period.getMonths();
		System.out.println("year: " + years + ", month: " + months);
	}

	private static void dateAfterPeriod() {
		LocalDate ldate = LocalDate.now().plusDays(20);
		DayOfWeek dayOfWeek = ldate.getDayOfWeek();
		System.out.println(FormatUtils.format(ldate, pattern) + "- " + dayOfWeek);
	}

	private static void remainingMonths() {
		LocalDate ldate = LocalDate.now();
		LocalDate ldateEnd = LocalDate.of(ldate.getYear(), 12, 31);
		Period period = Period.between(ldate, ldateEnd);
		if (period.getDays() >= 1) {
			period = period.plusMonths(1);
		}
		System.out.println(period.getMonths());

	}

	private static void getAge() {
		LocalDate ldate = LocalDate.of(1999, 8, 9);
		LocalDate now = LocalDate.now();
		Period period = Period.between(ldate, now);
		System.out
				.println(period.getYears() + " years  " + period.getMonths() + " months " + period.getDays() + " days");
	}

}
