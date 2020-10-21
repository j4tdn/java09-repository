package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.*;


public class Ex03 {
	public static void main(String[] args) {
		//start:20/04/2020 10:20:30
		//now:current time
		Calendar cStart=Calendar.getInstance();
		cStart.set(2020, APRIL, 20, 10, 20, 30);
		
		Calendar cnow=Calendar.getInstance();
		
		if(cnow.before(cStart)) {
			throw new RuntimeException("invalid time range");
		}
		
		long start= cStart.getTimeInMillis();
		long now=cnow.getTimeInMillis();
		
		long duration=now-start;
		long days= TimeUnit.MILLISECONDS.toDays(duration);

		long remainingHour=duration- TimeUnit.DAYS.toMillis(days);
		long hours=TimeUnit.MILLISECONDS.toHours(remainingHour);
		
		long remainingMinutes=remainingHour- TimeUnit.HOURS.toMillis(hours);
		long minutes=TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);

		long remainingSecond=remainingMinutes- TimeUnit.MINUTES.toMillis(minutes);
		long seconds=TimeUnit.MILLISECONDS.toSeconds(remainingSecond);
		
		System.out.println(days+"-"+hours+"-"+minutes+"-"+seconds);
		
		
	}
}
