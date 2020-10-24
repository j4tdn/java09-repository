package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static java.util.Calendar.*;

public class Ex03 {
	public static void main(String[] args) {
		// start:20/04/2020 10:20:30
		// now:curent time
		Calendar cstart = Calendar.getInstance();
		cstart.set(2020, APRIL, 20, 10, 20, 30);
		Calendar cnow = Calendar.getInstance();
		if (cnow.before(cstart)) {
			throw new RuntimeException("Invaid time range");

		}
		long start = cstart.getTimeInMillis();
		long now = cnow.getTimeInMillis();

		long duration = now - start;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		// số h còn lại
		long remainingHours = duration - TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(remainingHours);
		// số phút còn lại
		long remainingMinutes = remainingHours - TimeUnit.HOURS.toMillis(hours);
		long minute = TimeUnit.MILLISECONDS.toMinutes(remainingMinutes);
		// só giây còn lại
		long remainingSeconds = remainingMinutes - TimeUnit.MINUTES.toMillis(minute);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(remainingSeconds);
		System.out.println(days + "-" + hours + "-" + minute + "-" + seconds);

	}
}
