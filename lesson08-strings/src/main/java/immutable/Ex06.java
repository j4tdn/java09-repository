package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = "LeNa, LeTeo, HoangNa, VanTeo, LeTa"; 
		System.out.println(String.join(" - ", getStudentStartWith(students,"Le")));
	}
	
	private static String[] getStudentStartWith(String students, String start) {
		
//		
//		result = 
		String[] str = students.split(", ");
		String[] result = new String[str.length];
		int index = 0;
		for (String string : str) {
			if(string.startsWith(start) == true) {
				result[index++] = string;
			}
		}
		
		return Arrays.copyOfRange(result, 0, index);
	}
}
