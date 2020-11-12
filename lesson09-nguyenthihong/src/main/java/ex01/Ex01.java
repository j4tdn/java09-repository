package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = getAllStudents();
		Student[] getAStudents = getStudents(students, t -> t.getClassification() == Classification.A);
		for (Student student : getAStudents) {
			System.out.println(student);
		}
		Student[] getFStudents = getStudents(students, s -> s.getClassification() == Classification.F);
		for (Student student : getFStudents) {
			System.out.println(student);
		}
	}

	public static Student[] getAllStudents() {
		Student[] students = new Student[11];
		students[0] = new Student("102", "Nam", Classification.C);
		students[1] = new Student("104", "Hoàng", Classification.D);
		students[2] = new Student("109", "Lan", Classification.A);
		students[3] = new Student("103", "Bảo", Classification.F);
		students[4] = new Student("105", "Nguyên", Classification.B);
		students[5] = new Student("107", "Vũ", Classification.F);
		students[6] = new Student("106", "Bảo", Classification.F);
		students[7] = new Student("202", "Đạt", Classification.C);
		students[8] = new Student("117", "Vũ", Classification.C);
		students[9] = new Student("193", "Bảo", Classification.B);
		students[10] = new Student("199", "Tài", Classification.A);

		return students;
	}

	public static Student[] getStudents(Student[] students, Condition condition) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (Student student : students) {
			if (condition.check(student)) {
				result[index++] = student;
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}
}
