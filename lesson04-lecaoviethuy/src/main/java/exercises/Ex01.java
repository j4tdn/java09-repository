package exercises;

import entities.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student s1 = new Student(102180071, "Le Cao Viet Huy", 7.6f, 9.2f);
		Student s2 = new Student(102180000, "Phan Ngoc Quang", 8.4f, 9.6f);
		Student s3 = new Student();
		s3.setId(102170391);
		s3.setName("Le Van Teo");
		s3.setTheoryPoint(7.5f);
		s3.setPracticePoint(8.7f);
		
		System.out.printf("%-15s%-20s%-15s%-20s\n", "id", "name", "practice point", "theory point");
		System.out.println(s1.toFormatedString());
		System.out.println(s2.toFormatedString());
		System.out.println(s3.toFormatedString());
	}
}
