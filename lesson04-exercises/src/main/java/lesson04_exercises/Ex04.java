package lesson04_exercises;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Director director = new Director();
		Manager manager = new Manager();
		Staff staff1 = new Staff();
		Staff staff2 = new Staff();
		System.out.println("Nhập thông tin của giám đốc");
		director.Input();
		director.InputDirector();
        System.out.println("Nhập thông tin trưởng phòng");
		manager.Input();
		manager.InputManager();
		System.out.println("Nhập thông tin nhân viên thứ nhất");
		staff1.Input();
		staff1.InputStaff();
		System.out.println("Nhập thông tin nhân viên thứ hai");
		staff2.Input();
		staff2.InputStaff();
		System.out.print("Thông tin giám đốc:  ");
		director.OutputDirector();
		System.out.print("Thông tin trưởng phòng: ");
		manager.OutputManager();
		System.out.print("Thông tin nhân viên thứ nhất: ");
		staff1.OutputStaff();
		System.out.print("Thông tin nhân viên thứ hai: ");
		staff2.OutputStaff();

	}
}
