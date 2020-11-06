package bt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import static java.util.Calendar.*;
import static java.time.temporal.TemporalAdjusters.*;
import java.util.Date;
import java.util.Scanner;

public class BT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay thang nam dd/MM/yyyy");
		String dateS = sc.nextLine();
		execute2(dateS);
	}
	
	private static void execute1(String dateS) {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		try {
			date = formatter.parse(dateS);
		} catch (Exception e) {
			// TODO: handle exception
		}
		c.setTime(date);
		formatter = new SimpleDateFormat("dd MMMM yyyy ' is a ' EEEE");
		System.out.println(formatter.format(date));
		
		int doy = c.get(DAY_OF_YEAR);
		int daysLeft = c.getActualMaximum(DAY_OF_YEAR) - doy;
		System.out.println("*Additional facts:");
		System.out.println("-It is day number " + doy + " of the year, " + daysLeft +" days left.");
		
		Calendar start = Calendar.getInstance();
		start.set(c.get(YEAR), 0, 1);
		Calendar end = Calendar.getInstance();
		end.set(c.get(YEAR), 11, 31);
		int count=0, count1=0, count2=0;
		while (start.get(DAY_OF_WEEK) != c.get(DAY_OF_WEEK)) {
			count1++;
			start.add(DAY_OF_YEAR, 1);
		}
		count1--;
		while (end.get(DAY_OF_WEEK) != c.get(DAY_OF_WEEK)) {
			end.roll(DAY_OF_YEAR, -1);
			count2++;
		}
		count2--;
		int sumDaysInYear = c.getActualMaximum(DAY_OF_YEAR);
		int temp = sumDaysInYear - count1 - count2;
		int sumDowInYear = (int) temp/7 + 1; 
		int dowInYear = (doy - count1)/7 + 1;
		formatter = new SimpleDateFormat("EEEE");
		System.out.println("-It is " + formatter.format(date) + " number " + dowInYear + " out of " + sumDowInYear + " in " + c.get(YEAR));
		
		start.set(c.get(YEAR), c.get(MONTH), 1);
		count1=0;
		while (start.get(DAY_OF_WEEK) != c.get(DAY_OF_WEEK)) {
			count1++;
			start.add(DAY_OF_YEAR, 1);
		}
		count1--;
		count2=0;
		start.set(DAY_OF_MONTH, c.getActualMaximum(DAY_OF_MONTH));
		while (start.get(DAY_OF_WEEK) != c.get(DAY_OF_WEEK)) {
			start.roll(DAY_OF_MONTH, -1);
			count2++;
		}
		count2--;
		int sumDowInMonth = (c.getActualMaximum(DAY_OF_MONTH) - count1 - count2)/7 + 1;
		int dowInMonth = (c.get(DAY_OF_MONTH) - count1)/7+ 1;
		String s1 = formatter.format(date);
		formatter = new SimpleDateFormat("MMMM yyyy");
		String s2 = formatter.format(date);
		System.out.println("-It is " + s1 + " number " + dowInMonth + " out of " + sumDowInMonth + " in " + s2);
		
		System.out.println("-Year " + c.get(YEAR)  + " has " + c.getActualMaximum(DAY_OF_YEAR) + " days.");
		System.out.println("-" + s2 + " has " + c.getActualMaximum(DAY_OF_MONTH) + " days.");
	}
	
	private static void execute2(String dateS) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(dateS, formatter);
		
		formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy 'is a ' EEEE");
		System.out.println(formatter.format(date));
		
		System.out.println("*Additional facts:");
		
		int daysLeft = date.lengthOfYear() - date.getDayOfYear();
		System.out.println("-It is day number " + date.getDayOfYear() + " of the year, " + daysLeft + " days left." );
		
		LocalDate start = LocalDate.of(date.getYear(), Month.JANUARY, 1);
		LocalDate end = LocalDate.of(date.getYear(), Month.DECEMBER, 24);
		LocalDate first = start.with(next(date.getDayOfWeek()));
		LocalDate last = end.with(next(date.getDayOfWeek()));
		int sumDowInYear = (last.getDayOfYear() - first.getDayOfYear())/7 + 1; 
		int dowInYear = (date.getDayOfYear() - start.getDayOfYear())/7 + 1;
		formatter = DateTimeFormatter.ofPattern("EEEE");
		String dow = formatter.format(date);
		System.out.println("-It is " + dow + " number " + dowInYear + " out of " + sumDowInYear + " in " + date.getYear());
		
		start.withMonth(date.getMonthValue());
		first = start.with(next(date.getDayOfWeek()));
		end.withMonth(date.getMonthValue());
		end.withDayOfMonth(date.lengthOfMonth()-7);
		last = end.with(next(date.getDayOfWeek()));
		int sumDowInMonth = (last.getDayOfMonth() - first.getDayOfMonth())/7 + 1;
		int dowInMonth = (date.getDayOfMonth() - first.getDayOfMonth())/7 + 1;
		formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
		String my = formatter.format(date);
		System.out.println("-It is " + dow + " number " + dowInMonth + " out of " + sumDowInMonth + " in " + my);
		
		
		System.out.println("-Year " + date.getYear() + " has " + date.lengthOfYear() + " days.");
		System.out.println("-" + my + " has " + date.lengthOfMonth() + " days.");
	}
}
