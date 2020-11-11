package java07;

import java.util.Calendar;
import java.util.Scanner;

import static java.util.Calendar.*;
import java.text.SimpleDateFormat;

public class Ex01 {
	private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) {
		getAllSundaysInYear();
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập năm cần tìm thông tin ngày chủ nhật cuối cùng: ");
		int year = Integer.parseInt(ip.nextLine());
		getLastSunday(year);
	}

	private static void getLastSunday(int year) {
		System.out.println("NGÀY CHỦ NHẬT CUỐI CÙNG CỦA NĂM " + year);
		Calendar c = Calendar.getInstance();
		c.set(YEAR, year);
		c.set(MONTH, 11);
		c.set(DAY_OF_MONTH, 31);

		if(c.get(DAY_OF_WEEK) != 1) {
			c.add(DAY_OF_MONTH, 1 - c.get(DAY_OF_WEEK));
		}
		System.out.println(formatter.format(c.getTime()));
	}

	private static void getAllSundaysInYear() {
		Calendar c = Calendar.getInstance();
		int curYear = c.get(YEAR);
		System.out.println("THÔNG TIN TẤT CẢ CÁC NGÀY CHỦ NHẬT TRONG NĂM " + curYear);
		c.set(MONTH, 0);
		c.set(DAY_OF_MONTH, 1);

		if(c.get(DAY_OF_WEEK) != 1) {
			c.add(DAY_OF_MONTH, 8 - c.get(DAY_OF_WEEK));
		}

		while(c.get(YEAR) == curYear) {
			System.out.println(formatter.format(c.getTime()));
			c.add(DAY_OF_YEAR, 7);
		}
	}
}
