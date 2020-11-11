package bai1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bai1 {
	public static void main(String[] args) {
		Student[] students = {
				new Student("102", "Nam", Type.A),
				new Student("104", "Hoàng", Type.D),
				new Student("109", "Lan", Type.A),
				new Student("103", "Bảo", Type.F),
				new Student("105", "Nguyên", Type.B),
				new Student("107", "Vũ", Type.F),
				new Student("103", "Bảo", Type.F),
				new Student("202", "Đạt", Type.C),
				new Student("107", "Vũ", Type.C),
				new Student("193", "Bảo", Type.B),
				new Student("199", "Tài", Type.A)
			};
		Student[] AStudents = getAStudents(students);
		System.out.println("Những học sinh đoạt loại A trong năm 2020 là:");
		for (Student student:AStudents) {
			System.out.println(student);
		}
		
		Student [] againStudents = getAgainStudents(students);
		System.out.println("Những học sinh đã học lại trong năm 2020 là:");
		for (Student student:againStudents) {
			System.out.println(student);
		}
	}	

	private static Student[] getAStudents(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		
		for (Student student:students) {
			if (student.getType() == Type.A) {
				result[index++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static Student[] getAgainStudents(Student[] students) {
		Student[] results = new Student[students.length];
		int index = 0;
		
		for (int i=0; i<students.length; i++) {
			if (students[i].getType() == Type.F) {
				for (int j=i+1; j<students.length; j++) {
					if (students[i].getId().equals(students[j].getId())) {
						int h = 0;
						for (h=0; h<index; h++) {
							if (students[h].getId().equals(students[i].getId())) {
								break;
							}
						}
						if (h==index) {
							results[index++] = students[i];
						}
					}
				}
			}
		}
		
		return Arrays.copyOfRange(results, 0, index);
	}
}
