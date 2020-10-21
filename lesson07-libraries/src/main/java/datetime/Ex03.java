package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.*;

public class Ex03 {
	public static void main(String[] args) {
		// start: 20/04/2020 10:20:30
		// now: current time
		
		Calendar start = Calendar.getInstance();
		start.set(2020, APRIL, 20, 10, 20, 30);
		Calendar now = Calendar.getInstance();
		
		if(now.before(start)) {
			throw new RuntimeException("Invalid time range");
		}
		
		long x = start.getTimeInMillis();
		long y = now.getTimeInMillis();
		long duration = y - x;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);
		
		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);
		
		long remainingSeconds = remainingMinutes - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSeconds);
		
		System.out.println("days: " + days
							+ "\nhours: " + hours
							+ "\nminutes: " + minutes
							+ "\nseconds: " + seconds);
		
		
	}
}
