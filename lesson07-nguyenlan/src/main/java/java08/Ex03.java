package java08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Calendar.*;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("day: ");
		int day = ip.nextInt();
		System.out.println("month: ");
		int month = ip.nextInt();
		System.out.println("year: ");
		int year = ip.nextInt();
		LocalDate ldate = LocalDate.of(year, month, day);

		Calendar c = Calendar.getInstance();
		c.set(YEAR, ldate.getYear());
		System.out.println("It is day number " + ldate.getDayOfYear()
							+ " of the year, " + (ldate.lengthOfYear() - ldate.getDayOfYear()) + " days left");

		DayOfWeek dayOfWeek = ldate.getDayOfWeek();
		LocalDate startYearDate = LocalDate.of(ldate.getYear(), 1, 1).with(TemporalAdjusters.nextOrSame(dayOfWeek));
		LocalDate endYearDate = LocalDate.of(ldate.getYear(), 12, 31).with(TemporalAdjusters.previousOrSame(dayOfWeek));
	    long dowNumber = ChronoUnit.WEEKS.between(startYearDate, ldate) + 1;
	    long totalDowNumber = ChronoUnit.WEEKS.between(startYearDate, endYearDate) + 1;
		System.out.println("It is " + dayOfWeek 
				+ " number " + dowNumber 
				+ " out of " + totalDowNumber 
				+ " in " + ldate.getYear());

		LocalDate startMonthDate = LocalDate.of(ldate.getYear(), ldate.getMonth(), 1)
									.with(TemporalAdjusters.nextOrSame(dayOfWeek));
		LocalDate endMonthDate = LocalDate.of(ldate.getYear(), ldate.getMonth(), ldate.lengthOfMonth())
									.with(TemporalAdjusters.previousOrSame(dayOfWeek));
	    dowNumber = ChronoUnit.WEEKS.between(startMonthDate, ldate) + 1;
	    totalDowNumber = ChronoUnit.WEEKS.between(startMonthDate, endMonthDate) + 1;
		System.out.println("It is " + dayOfWeek 
				+ " number " + dowNumber 
				+ " out of " + totalDowNumber
				+ " in " + ldate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));

		System.out.println("Year " + ldate.getYear() + " has " + ldate.lengthOfYear() + " days");

		System.out.println(ldate.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + ldate.getYear()
						+ " has " + ldate.lengthOfMonth() + " days");

	}
}
