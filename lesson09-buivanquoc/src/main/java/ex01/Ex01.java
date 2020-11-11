package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {

		// 102-Nam-C
		// 104-Hoàng-D 109-Lan-A 103-Bảo-F 105-Nguyên-B 107-Vũ-F 103-Bảo-F 202-Đạt-C
		// 107-Vũ-C 193-Bảo-B 199-Tài-A
		Student st1 = new Student(102, "Nam", Title.C);
		Student st2 = new Student(104, "Hoàng", Title.D);
		Student st3 = new Student(109, "Lan", Title.F);
		Student st4 = new Student(103, "bảo", Title.B);
		Student st5 = new Student(105, "Nguyên", Title.F);
		Student st6 = new Student(107, "Vũ", Title.F);
		Student st7 = new Student(103, "Bảo", Title.F);
		Student st8 = new Student(202, "Đạt", Title.C);
		Student st9 = new Student(107, "Vũ", Title.C);
		Student st10 = new Student(193, "Bảo", Title.B);
		Student st11 = new Student(199, "Tài", Title.A);
		Student[] student = {

				st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11 };
		Student[] result = checkA(student);
		System.out.println(result);
	}

	private static Student[] checkHocLai(Student[] students) {
		int count = 0;
		int index = 0;
		Student[] result = new Student[students.length];
		for (Student student : students) {
			for (Student student1 : students) {
				if (student.getId() == student1.getId()) {
					index++;
				}
			}
			if (student.getXeploai() == Title.F || index == 1) {
				result[count++] = student;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}

	private static Student[] checkA(Student[] students) {
		int count = 0;
		Student[] result = new Student[students.length];
		for (Student student : students) {
			if (student.getXeploai() == Title.A) {
				result[count++] = student;
			}
		}

		return Arrays.copyOfRange(result, 0, count);
	}
}
