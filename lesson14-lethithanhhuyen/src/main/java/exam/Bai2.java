package exam;

import java.util.Calendar;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tuoi");
		int age = sc.nextInt();
		System.out.println("Nhap thoi gian da ngu");
		System.out.println("+ gio");
		int hours = sc.nextInt();
		System.out.println("+ phut");
		int minutes = sc.nextInt();
		System.out.println("Nhap gio bat dau ngu");
		int start = sc.nextInt();
		
		int hourNeed = 0;
		if (age>=1 && age<=3) {
			hourNeed = 20;
		} else if (age <= 13) {
			hourNeed = (10+12)/2;
		} else if (age<=17) {
			hourNeed = (8 + 10)/2;
		} else if (age<=64) {
			hourNeed = (7+9)/2;
		} else if (age<=65) {
			hourNeed = (7+8)/2;
		}
		
		int resMinutes = 0, resHours = 0;
		if (minutes>0) {
			resMinutes = 60 - minutes;
			resHours = -1;
		}
		resHours += hourNeed - hours;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR, start);
		c.add(Calendar.HOUR, resHours);
		System.out.println("Giờ nên thức dậy là " + c.get(Calendar.HOUR) + "h" + resMinutes);
	}
	
}
