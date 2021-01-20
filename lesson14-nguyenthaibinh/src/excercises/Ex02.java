package excercises;

import java.util.Scanner;

import Beans.Person;



public class Ex02 {
	public static void main(String[] args) {
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tuoi hien tai cua ban");
		person.setAge(sc.nextInt());
		System.out.println("Nhap thoi gian da ngu trong ngay");
		System.out.println("So gio: ");
		person.setSleepedTimeHour(sc.nextInt());
		System.out.println("So phut: ");
		person.setSleepedTimeMinus(sc.nextInt());
		System.out.println("Nhap thoi gian bat dau ngu");
		person.setTimeStart(sc.nextInt());
		System.out.println("Thoi gian ban phai thuc day la: ");
		System.out.println(calculateTimeShouldWakeUp(person));
	}
	private static String calculateTimeShouldWakeUp(Person person) {
		String result = "";
		if(person.getAge() >= 1 && person.getAge() <= 3) {
			
		}
		
	}
	
}
