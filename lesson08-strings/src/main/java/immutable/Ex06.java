package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String student = "leNa, LeTeo, HoangNa, VanTeo, LeTa";
	//	String[] relust = getStudents(students, "le");
		//System.out.println(String.join(",", relust));
	}
	public static String[] getStudents(String students,String prefix) {
		String[] studentArray = students.split(", ");
		String[] result = new String[studentArray.length];
		int k=0;
		for(String student: studentArray) {
			if(student.startsWith(prefix)) {
				result[k++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, k);
	}
}
