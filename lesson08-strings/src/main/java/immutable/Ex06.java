package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = "LeNA,LeVanCuong,HoangNa,LeVy,HoangVY,LeAn,TranVan";
		String[] result = getStudentsStartWith(students, "Le");
		System.out.println(String.join(" - ", result));
	}

	private static String[] getStudentsStartWith(String students, String start) {
		String[] result = new String[students.length()];
		String[] temps = students.split(",");
		int index = 0;
		for (String temp : temps) {
			if (temp.startsWith(start)) {
				result[index++] = temp;
			}
		}
		return Arrays.copyOfRange(result, 0, index);

	}
}
