package Exam;

import java.util.Arrays;

public class Bai1 {
	public static void main(String[] args) {
		String[] students = {
				"102-Nam-C", 
				"104-Hoàng-D",
				"109-Lan-A",
				"103-Bảo-F",
				"105-Nguyên-B",
				"107-Vu-F",
				"103-Bão-F",
				"202-Đat-C",
				"107-Vũ-C",
				"193-Bảo-B",
				"199-Tài-A",
		};
		String[] result1 = getStudentsTypeA(students);
		System.out.println(String.join(", ", result1));
		String[] result2 = getStudentsTypeF(students);
		System.out.println(String.join(", ", result2));
	}
	
	private static String[] getStudentsTypeA(String[] student) {
		String[] result1=new String[student.length];
		int index=0;
		for (String students : student) {
			if (students.endsWith("A")) {
				int firstDashIndex = students.indexOf("-");
				int lastDashIndex = students.lastIndexOf("-");
				result1[index++] = students.substring(firstDashIndex +1, lastDashIndex);
			}
		}
		return Arrays.copyOfRange(result1, 0, index);
	}
	private static String[] getStudentsTypeF(String[] student) {
		String[] result2=new String[student.length];
		int index=0;
		for (String students : student) {
			if (students.endsWith("F")) {
				int firstDashIndex = students.indexOf("-");
				int lastDashIndex = students.lastIndexOf("-");
				result2[index++] = students.substring(firstDashIndex +1, lastDashIndex);
			}
		}
		return Arrays.copyOfRange(result2, 0, index);
	}
}
