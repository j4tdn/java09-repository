package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = "LeNa, LeTeo, HoangNa, VanTeo, LeTa";
		String[] result = getStudentsStartWith(students, "Le");
		System.out.println(String.join(", ", result));
	}

	private static String[] getStudentsStartWith(String students, String prefix) {
		String[] names = students.split(", ");
		String[] result = new String[names.length];
		int index = 0;
		for (String name : names) {
			if (name.startsWith(prefix)) {
				result[index++] = name.substring(prefix.length());
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
