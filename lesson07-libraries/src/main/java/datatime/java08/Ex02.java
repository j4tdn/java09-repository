package datatime.java08;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import common.TimeRange;
import utils.DateUtils;

public class Ex02 {
	public static void main(String[] args) {
		
		DateTimeFormatter fommatter=DateTimeFormatter.ofPattern("HH:mm:ss");
		//java08: loacalDay,localTime,LocalDayTime
		LocalTime ltime=LocalTime.now();
		ltime=	ltime.withMinute(46);//set 
		
		System.out.println("ltime:"+fommatter.format(ltime));
		
		LocalTime formatted=LocalTime.parse("05:40:32",fommatter) ;//set h
		System.out.println("formatted:"+formatted);
		
		
		System.out.println("==========================");
		LocalTime start=LocalTime.of(10, 15, 16);
		LocalTime end=LocalTime.now();
		Duration duration=Duration.between(start, end);
		TimeRange timeRange=DateUtils.getDurations(duration);
		System.out.println(timeRange.toString());
		
		
	}
}
