package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = "LeNa,LeTeo,HoangNa,VanTeo,LeTa";
		String output = String.join(",", getStudentsStartWith(students, "Le"));
		System.out.println(output);
	}
	
	private static String[] getStudentsStartWith (String students,String startWith) {
		String[] name = students.split(",");
		String[] result = new String[name.length];
		int index =0;
		for (int i =0; i< name.length; i++) {
			if (name[i].startsWith(startWith)) {
				result[index++] = name[i];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
