package immutable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex06 {
	//
	public static void main(String[] args) {
		String students = "LeNa,LeTeo,HoangNa,VanTeo,LeTa";
		
		System.out.println(getStudents(students, "Le"));
		
		
	}
	private static String[] getStudents(String students, String prefix) {
		String[] studentsArray =  students.trim().split(",");
		String [] result = new String[students.length()];
		int k=0;
		for(String student:studentsArray) {
			if(student.startsWith(prefix)) {
				result[k++]=student;
			}
			
		}
		return Arrays.copyOfRange(result, 0, k);
		
		
		
		
	}

}
