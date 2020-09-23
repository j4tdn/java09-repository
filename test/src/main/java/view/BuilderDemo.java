package view;

import beans.Student;

public class BuilderDemo {
	public static void main(String[] args) {
		Student first = Student.builder().name("Tien").id("T").phoneNumber("123").build();
		Student second = Student.builder().phoneNumber("456").build();
		System.out.println(first);
		System.out.println(second);
	}
}
