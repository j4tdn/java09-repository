package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.*;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cstart = Calendar.getInstance();
		cstart.set(2020, APRIL, 20, 10, 20, 30);
		
		Calendar cnow = Calendar.getInstance();
		
		if (cnow.before(cstart)) {
			throw new RuntimeException("chia tay sớm bớt đau khổ");
		}
		
		long start= cstart.getTimeInMillis();
		long now= cnow.getTimeInMillis();
		
		long duration = now - start;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		
		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);
		
		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);
		
		long remainingSeconds = remainingMinutes - TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSeconds);
		
		System.out.println(days + " ngày " + hours + " giờ " + minutes + " phút " + seconds + " giây");
	}

}
