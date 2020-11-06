package bai2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

	
public class UltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập thời gian bắt đầu hẹn hò :");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime start = LocalDateTime.parse(ip.nextLine(), formatter);
		
		System.out.println("Bạn đã chia tay chưa? Nếu có thì nhập ngày chia tay !");
		System.out.println("1.Có");
		System.out.println("2.Không");
		System.out.print("Bạn chọn :");
		int choice = Integer.parseInt(ip.nextLine());
		LocalDateTime end = null;
		switch (choice) {
		case 2:
			end = LocalDateTime.now();
			break;
		case 1:
			System.out.print("Nhập thời gian chia tay: ");
			end = LocalDateTime.parse(ip.nextLine(), formatter);
			break;	
		default:
			break;
		}
		System.out.print("Bạn đã hẹn hò được : " + getDayTimeRange(start, end).getDateRange().toString() + " " 
				+  getDayTimeRange(start, end).getTimeRange().toString());
		
		System.out.println("\nNgày bắt đầu hẹn hò là :" + start.getDayOfWeek());
		

	}
	public static DayTimeRange getDayTimeRange(LocalDateTime start, LocalDateTime end) {

		
		LocalDate dateStart = start.toLocalDate();
		LocalDate dateEnd = end.toLocalDate();
		
		LocalTime timeStart = start.toLocalTime();
		LocalTime timeEnd = end.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if (timeEnd.isBefore(timeStart)) {
			period = period.minusDays(1);

			if (period.getDays() < 0 ) {
				period = period.minusMonths(1);
				int previousMonth = dateEnd.getMonthValue() - 1;

				int year = dateEnd.getYear();
				int days = YearMonth.of(year,previousMonth).lengthOfMonth() - 1;
				period = period.withDays(days);
				if (period.getMonths() < 0) {
					period = period.minusYears(1);
					period = period.withMonths(11);
					
				} else {

				}

			}
			duration = duration.plusDays(1);
		}
		
		long years = period.getYears();
		long months = period.getMonths();
		long days = period.getDays();
		
		
		DateRange dateRange = new DateRange(years,months,days);
		
		TimeRange timeRange = getDurations(duration);
		
		
		return DayTimeRange.builder().withDateRange(dateRange).withTimeRange(timeRange).build();
	}
	public static TimeRange getDurations(Duration duration) {
		long durations = duration.getSeconds();
		long hours = TimeUnit.SECONDS.toHours(durations);
		duration = duration.minusHours(hours);
		long minutes = duration.toMinutes();
		long seconds = duration.minusMinutes(minutes).getSeconds();
		
		return new TimeRange(hours,minutes,seconds);
	}
}