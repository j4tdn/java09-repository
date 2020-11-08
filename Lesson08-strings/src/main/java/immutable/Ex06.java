package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
	String students="LeNa, LeTeo, HoangNa";
	System.out.println(getStudentsStartWith(students, "Le"));
	
}
	private static String[] getStudentsStartWith(String students, String prefix) {
		String[] studentArray= students.trim().split(", ");
		String[] result= new String[studentArray.length];
		int k=0;
		for(String student : studentArray) {
			if(student.startsWith(prefix)) {
				result[k++]+=student;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
