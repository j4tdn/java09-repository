package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = "LeNa, LeTeo, HoangNa, Vanteo, LeTa";
		System.out.println(String.join(",", getStudents(students, "Le")));
	}

	private static String[] getStudents(String students, String startWith) {
		String[] student = students.trim().split(", ");
		String[] result = new String[student.length];
		int k = 0;
		for (String student1 : student) {
			if (student1.startsWith(startWith)) {
				result[k++] = student1;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
