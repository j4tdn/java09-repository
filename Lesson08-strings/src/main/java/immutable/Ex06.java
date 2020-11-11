package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = " LeNa, LeTeo, HoangNa, VanTeo, LeTa";
		System.out.println(String.join(" , ", getStudents(students, "Le")));
	}
	private static String[] getStudents(String students, String prefix) {
		String[] studentArray = students.split(" , ");
		String[] result = new String[studentArray.length];
		int index = 0;
		for(String student: studentArray) {
			if(student.startsWith(prefix)) {
				result[index++]= student;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
		
	}
}
