package lesson07.bai1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class SoNgayChuNhat {
	public static void main(String[] args) {
		System.out.println("So ngay chu nhat trong nam 2020 la : " + getAllSundaysInYear(2020));
		Scanner sc = new Scanner(System.in);
		System.out.print("Moi nhap nam : ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.println("Ngay chu nhat cuoi cung cua nam " + year +" la : " + getLastSundayInYear(year) );
	}
	public static int getAllSundaysInYear(int year) {
		LocalDate start = LocalDate.of(year, 1, 1);
		LocalDate end = LocalDate.of(year, 12, 31);
		
//		System.out.println(start.getDayOfWeek().getValue());
		start = start.minusDays(start.getDayOfWeek().getValue());
//		System.out.println(start);
		
		Period period = Period.between(start, end);
		int countSundays = 0;
		
		int days = period.getDays() + 365;
		
		System.out.println(days);
		while(days >= 0) {
			countSundays++;
			days = days - 7;
		}
		
		return countSundays;
		
	}
	public static LocalDate getLastSundayInYear(int year) {
		LocalDate date = LocalDate.of(year+1, 1, 1);
		System.out.println(date.getDayOfWeek().getValue());
		LocalDate lastSunday = date.minusDays(date.getDayOfWeek().getValue());
		return lastSunday;
	}
}
