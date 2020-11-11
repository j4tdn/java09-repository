package ex01;

import java.util.Arrays;

import javax.naming.spi.DirStateFactory.Result;

public class Demo {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Type.C), new Student(104, "Hoang", Type.D),
				new Student(109, "Lan", Type.A), new Student(103, "Bao", Type.F), new Student(105, "Nguyen", Type.B),
				new Student(107, "Vu", Type.F), new Student(103, "Bao", Type.F), new Student(202, "Dat", Type.C),
				new Student(107, "Vu", Type.C), new Student(193, "Bao", Type.B), new Student(199, "Tai", Type.A),

		};
		System.out.println(getStudents(students, Type.A));

	}

	private static Student[] getStudents(Student[] students, Type type) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (Student student : students) {
			if (student.getType() == Type.A) {
				result[index++] = student;
			}

		}
		return Arrays.copyOfRange(result, 0, index);

	}
	private static Student[] getHocLai(Student[] students, Type type) {
		Student[] result = new Student[students.length];
		int index = 0;
		int k =0;
		for (Student student : students) {
			if (student.getType() == Type.F) {
				result[index++] = student;
				k++;
			}
		

		
		
		
	}
		return result;
}
}
