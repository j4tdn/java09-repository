package exam;

import java.util.Arrays;

import object.Classification;
import object.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = { new Student("102", "Nam", Classification.C),
				new Student("104", "Hoang", Classification.D), new Student("109", "Lan", Classification.A),
				new Student("103", "Bao", Classification.F), new Student("105", "Nguyen", Classification.B),
				new Student("107", "Vu", Classification.F), new Student("103", "Bao", Classification.F),
				new Student("202", "Dat", Classification.C), new Student("107", "Vu", Classification.C),
				new Student("193", "Bao", Classification.B), new Student("199", "Tai", Classification.A) };

		System.out.println("danh sach sinh vien loai A:");
		for (Student student : listStudentClassificationA(students)) {
			System.out.println(student);
		}
		
		System.out.println("danh sach sinh vien hoc lai:");
		for (Student student : listStudentStudyAgain(students)) {
			System.out.println(student);
		}

	}

	private static Student[] listStudentClassificationA(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getClassification() == Classification.A) {
				result[index++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}

	private static Student[] listStudentStudyAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (int i = 0; i < students.length; i++) {
			if ((students[i].getClassification() == Classification.F) && isStudyMoreTwoTime(students, students[i].getId())) {
				result[index++] = students[i];
			}
		}
		
		
		return Arrays.copyOfRange(result, 0, index);
	}

	private static boolean isStudyMoreTwoTime(Student[] students,String students2) {
		int count = 0;
		for (Student s : students) {
			if (s.getId().equals(students2)) {
				count++;
			}
		}
		if (count >= 2) {
			return true;
		}
		return false;
	}

}
