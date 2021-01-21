package bai2;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sleepTime = 0.0;
		int age;
		int hour;
		int minute;
		int starSleep;
		System.out.print("Nhap tuoi hien tai cua ban :");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap thoi gian da ngu trong ngay:");
		System.out.print("Gio:");
		hour = Integer.parseInt(sc.nextLine());
		System.out.print("Phut:");
		minute = Integer.parseInt(sc.nextLine());
		
		System.out.println("Nhap thoi gian bat dau ngu :");
		starSleep = Integer.parseInt(sc.nextLine());
		
		sleepTime=sleepTime(age);
		double sumTime = starSleep*60 + sleepTime*60 - (hour*60 + minute);
		
		int hourWakeUp = 0;
		int minuteWakeUp = 0;
		if (sumTime >= 24*60) {
			hourWakeUp = (int) (sumTime/60 - 24);
			minuteWakeUp = (int) (sumTime - 24*60 - hourWakeUp*60);
		} else {
			hourWakeUp = (int) (sumTime/60);
			minuteWakeUp = (int) (sumTime - hourWakeUp*60);
		}
		System.out.println("Thoi gian ban nen thuc day la : " + hourWakeUp + "H" + minuteWakeUp);
	}
	public static double sleepTime(int  age) {
		double sleepTime=0.0;
		if (age <= 3) {
			sleepTime = 20.0;
		} else if (age <= 13) {
			sleepTime = 11.0;
		}else if (age <= 17) {
			sleepTime = 9.0;
		}else if (age <= 64) {
			sleepTime = 8.0;
		} else {
			sleepTime = 7.5;
		}
		return sleepTime;
	}
}
