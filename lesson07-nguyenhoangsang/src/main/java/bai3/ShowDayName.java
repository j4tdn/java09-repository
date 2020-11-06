package bai3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ShowDayName {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhập ngày:");
		String day = ip.nextLine();
		
		System.out.print("Nhập tháng:");
		String month = ip.nextLine();
		
		
		System.out.print("Nhập năm:");
		String year = ip.nextLine();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dateString = day + "/" + month + "/" + year;
		LocalDate date = LocalDate.parse(dateString,dateTimeFormatter);
		int dateNumber = date.getDayOfWeek().getValue();
		System.out.println("Ngày bạn nhập là : " + Days.values()[dateNumber-1].name());
		
	}
	public static enum Days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
}
