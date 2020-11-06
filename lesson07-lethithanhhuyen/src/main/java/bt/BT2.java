package bt;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay bat dau: dd/MM/yyyy HH:mm:ss");
		String startS = sc.nextLine();
		System.out.println("Ket thuc chua? Nhap 0 neu chua");
		String kt = sc.nextLine();
		String endS="";
		if (!kt.equals("0")) {
			System.out.println("Nhap ngay ket thuc");
			endS = sc.nextLine();
		}
		count1(startS, endS);
	}
	
	private static void count1(String startS, String endS) {
		String pattern = "dd/MM/yyyy HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime lStart = LocalDateTime.parse(startS, formatter);
		LocalDateTime lEnd = LocalDateTime.now();
		if (endS != "") {
			lEnd = LocalDateTime.parse(endS, formatter);
		}
		
		System.out.println("Ngay bat dau hen ho: " + lStart.getDayOfWeek());
		
		//B1: Convert to LocalDate, LocalTime
		LocalDate dateStart = lStart.toLocalDate();
		LocalDate dateEnd = lEnd.toLocalDate();
		
		LocalTime timeStart = lStart.toLocalTime();
		LocalTime timeEnd = lEnd.toLocalTime();
		
		//B2:Calculate Period, Duration
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);
			if (period.getDays()<0) {
				period = period.minusMonths(1);
				int previousMonth = dateEnd.getMonthValue() - 1;
				int year = dateEnd.getYear();
				int days = YearMonth.of(year, previousMonth).lengthOfMonth() - 1;
				period = period.withDays(days);
				if (period.getMonths()<0) {
					period = period.minusYears(1);
					period = period.withMonths(11);
				}
			}
			duration = duration.plusDays(1);
		}
		
		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();
		
		long durations = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();
		duration = duration.minusMinutes(minutes);
		long seconds = duration.getSeconds();
		System.out.println("Khoang thoi gian da hen ho:");
		System.out.println(years + " nam, " + months + " thang, " + days + " ngay, " 
							+ hours + " gio, " + minutes + " phut, " + seconds + " giay." );
	}
	
	private static void count2(String startS, String endS) {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date dstart = new Date();
		Date dend = new Date();
		try {
			dstart = formatter.parse(startS);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dend = formatter.parse(endS);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar cstart = Calendar.getInstance();
		cstart.setTime(dstart);
		Calendar cend = Calendar.getInstance();
		cend.setTime(dend);
		
		if (cend.before(cstart)) {
			throw new RuntimeException("Invalid time range");
		}
		long start = cstart.getTimeInMillis();
		long now = cend.getTimeInMillis();
		
		long duration = now - start;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long years = days/365;
		long daysLeft = days - years*365;
		
		long months = daysLeft/30;
		daysLeft -= months * 30;
				
		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);
		
		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);
		
		long remainingSeconds = remainingMinutes - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSeconds);
		
		System.out.println("Khoảng thời gian đã hẹn hò:");
		System.out.println(years + " năm " + months + " tháng " + daysLeft + " ngày "
							+ hours + " giờ " + minutes + " phút " + seconds + " giây.");
	}
	
}
