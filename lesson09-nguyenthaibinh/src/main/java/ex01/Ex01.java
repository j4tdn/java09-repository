package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Student st1 = new Student(102, "Nam", Type.C);
		Student st2 = new Student(104, "Hoàng", Type.D);
		Student st3 = new Student(109, "Lan", Type.A);
		Student st4 = new Student(103, "Bảo", Type.F);
		Student st5 = new Student(105, "Nguyên", Type.B);
		Student st6 = new Student(107, "Vũ", Type.F);
		Student st7 = new Student(103, "Bảo", Type.F);
		Student st8 = new Student(202, "Đạt", Type.C);
		Student st9 = new Student(107, "Vũ", Type.C);
		Student st10 = new Student(193, "Bảo", Type.B);
		Student st11 = new Student(199, "Tài", Type.A);
		
		Student[] students = {
				st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11
		};
		System.out.println("Danh sach sinh vien dat loai A: ");
		showArray(getStudentA(students));
		System.out.println("Danh sach sinh vien hoc lai:");
		showArray(getStudentReStudy(students));
	}
	
		// Lan Tai n n n
	private static String[] getStudentA(Student[] students) {
		int index = 0;
		String[] listStudentTypeA = new String[students.length];
		for(int i = 0; i < students.length; i++) {
			if(students[i].getType() == Type.A) {
				listStudentTypeA[index] = students[i].getHovaten();
				index++;
			}
		}
		return Arrays.copyOfRange(listStudentTypeA, 0, index);
	}
	private static String[] getStudentReStudy(Student[] students) {
		int index = 0;
		String[] listStudentReStudy = new String[students.length];
		for(int i = 0; i < students.length; i++) {
			if(students[i].getType() == Type.F) {
				listStudentReStudy[index] = students[i].getHovaten();
				index++;
			}
		}
		return Arrays.copyOfRange(listStudentReStudy, 0, index);
	}
	private static void showArray(String[] array) {
		for(int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
