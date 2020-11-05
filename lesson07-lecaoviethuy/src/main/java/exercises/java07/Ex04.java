package exercises.java07;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import static java.util.Calendar.*;


public class Ex04 {
	/*
	 * 1.Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở New York. 2. Kiểm tra tháng
	 * hiện tại có bao nhiêu ngày.
	 * 
	 * 3. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy). 
	 * 4. Xem ngày đầu tiên và cuối cùng của tuần hiện tại. 
	 * 5. Xem ngày hiện tại đang ở tuần thứ mấy trong năm. 
	 * 6. Thêm 8 tiếng vào thời gian hiện tại và in ra. 
	 * 7. Kiểm tra khoảng cách giữa 2 mốc thời gian là bao nhiêu năm, tháng. 
	 * 8. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy. 
	 * 9. Kiểm tra số tháng còn lại trong năm từ thời điểm hiện tại. 
	 * 10.Tính tuổi của bạn. Bao nhiêu năm, tháng, ngày.
	 */
	
	private static String datePattern = "dd/MM/yyyy";
	private static String dateTimePattern = "dd/MM/yyyy HH:mm:ss";
	private static SimpleDateFormat formatter = new SimpleDateFormat();

	public static void main(String[] args) {
		bt7();
	}

	public static void bt1() {
		System.out.println("====== 1.Thời gian hiện tại ở New York ======");
		
		Calendar calendar = Calendar.getInstance(Locale.US);
        TimeZone americaTimeZone=TimeZone.getTimeZone("America/New_York");
		calendar.setTimeZone(americaTimeZone);
		formatter.applyPattern(dateTimePattern);
		formatter.setTimeZone(americaTimeZone);
		System.out.println(formatter.format(calendar.getTime()));
	}

	public static void bt2() {
		System.out.println("===== 2.Kiểm tra tháng hiện tại có bao nhiêu ngày =====");
		Calendar c = Calendar.getInstance();
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

	public static void bt3() {
		System.out.println("===== 3.In ngày cuối cùng của tháng hiện tại =====");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		formatter.applyPattern(datePattern);
		System.out.println(formatter.format(c.getTime()));
	}

	public static void bt4() {
		System.out.println("===== 4.Xem ngày đầu tiên và cuối cùng của tuần hiện tại =====");
		Calendar c = Calendar.getInstance(Locale.FRANCE);
		int firstDateOfWeek = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
		c.set(DAY_OF_MONTH, firstDateOfWeek);
		formatter.applyPattern(datePattern);
		System.out.println(formatter.format(c.getTime()));
	}

	public static void bt5() {
		System.out.println("===== 5.Xem ngày hiện tại đang ở tuần thứ mấy trong năm =====");
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(WEEK_OF_YEAR));
	}

	public static void bt6() {
		System.out.println("===== 6. Thêm 8 tiếng vào thời gian hiện tại và in ra =====");
		Calendar c = Calendar.getInstance();
		c.add(HOUR, 8);
		formatter.applyPattern(dateTimePattern);
		System.out.println(formatter.format(c.getTime()));
	}
	
	public static void bt7() {
		System.out.println("===== 7. Kiểm tra khoảng cách giữa 2 mốc thời gian là bao nhiêu năm, tháng =====");
		int startYear = 2009;
		int startMonth = 11;
		int startDay = 20;
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(YEAR, startYear);
		birthday.set(MONTH, startMonth);
		birthday.set(DAY_OF_MONTH, startDay);
		Calendar now = Calendar.getInstance();
		int endYear = now.get(YEAR);
		int endMonth = now.get(MONTH);
		int endDay = now.get(DAY_OF_MONTH);
		
		int differenceYear = -1;
		int differenceMonth = -1;
		
		if(now.before(birthday)) {
			System.out.println("Lỗi dữ liệu!");
			return;
		} else {
			differenceMonth = monthsBetween(birthday, now);
			if(endDay >= startDay) {
				differenceYear = endYear - startYear;
			} else {
				if(endMonth == startMonth) {
					differenceYear = endYear - startYear - 1;
				} else {
					differenceYear = endYear - startYear;
				}
			} 
			if(endMonth < startMonth) {
				differenceYear = endYear - startYear - 1;
			} 
		}
		
		System.out.println("years: " + differenceYear
						+ ", months: " + differenceMonth);	
	}
	
	private static void bt8() {
		System.out.println("===== 8. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy =====");
		Calendar c = Calendar.getInstance();
		c.add(DAY_OF_MONTH, 20);
		formatter.applyPattern(datePattern);
		System.out.println(formatter.format(c.getTime()));
	}
	
	private static void bt9() {
		System.out.println("===== 9. Kiểm tra số tháng còn lại trong năm từ thời điểm hiện tại =====");
		Calendar c = Calendar.getInstance();
		System.out.println((11 - c.get(MONTH)));
	}
	
	private static void bt10() {
		System.out.println("===== 10.Tính tuổi của bạn. Bao nhiêu năm, tháng, ngày =====");
		int startYear = 2000;
		int startMonth = 7;
		int startDay = 25;
		
		Calendar birthday = Calendar.getInstance();
		birthday.set(YEAR, startYear);
		birthday.set(MONTH, startMonth);
		birthday.set(DAY_OF_MONTH, startDay);
		Calendar now = Calendar.getInstance();
		int endYear = now.get(YEAR);
		int endMonth = now.get(MONTH);
		int endDay = now.get(DAY_OF_MONTH);
		
		int differenceYear = -1;
		int differenceMonth = -1;
		int differenceDay = -1;
		
		if(now.before(birthday)) {
			System.out.println("Lỗi dữ liệu!");
			return;
		} else {
			differenceMonth = monthsBetween(birthday, now);
			if(endDay >= startDay) {
				differenceDay = endDay - startDay;
				differenceYear = endYear - startYear;
			} else {
				Calendar tmp = Calendar.getInstance();
				tmp.set(endYear, endMonth, endDay);
				tmp.add(MONTH, -1);
				differenceDay = tmp.getActualMaximum(DAY_OF_MONTH) - startDay + endDay;
				if(endMonth == startMonth) {
					differenceYear = endYear - startYear - 1;
				} else {
					differenceYear = endYear - startYear;
				}
			}
			if(endMonth < startMonth) {
				differenceYear = endYear - startYear - 1;
			}
		}
		
		System.out.println("years: " + differenceYear
						+ ", months: " + differenceMonth
						+ ", days: " + differenceDay);	
	}
	
	public static int monthsBetween(Calendar start, Calendar end) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(start.get(YEAR), start.get(MONTH), start.get(DAY_OF_MONTH));
	    
	    int count = 0;
	    while (cal.before(end)) {
	        cal.add(Calendar.MONTH, 1);
	        count++;
	    }
	    
	    return count % 12 - 1;
	}
	
}
