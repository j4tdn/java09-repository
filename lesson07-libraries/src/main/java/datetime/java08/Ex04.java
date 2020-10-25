package datetime.java08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

import common.DateRange;
import common.DateTimeRange;
import common.TimeRange;
import common.DateTimeRange.Builder;
import datetime.DateUtils;

public class Ex04 {
	// start: 20/04/2020 10:20:30 end : 22/06/2020 12:05:30
	
	//start 20/04/2020 10:20:30 end 22/06/2020 08:05:30
	//start 20/04/2020 10:20:30 end 20/02/2022 08:05:30
	
	//ktra xem yeu nhau dc bao lau
	// nam - thang - ngay - gio -phut -giay
	public static void main(String[] args) {
		LocalDateTime  start = LocalDateTime.of(2020, 4, 20, 10, 20, 30);
		LocalDateTime end = LocalDateTime.of(2022, 02, 20, 8, 05, 30);
		System.out.println(DateUtils.getdateTimeRange(start, end));
	}

}
