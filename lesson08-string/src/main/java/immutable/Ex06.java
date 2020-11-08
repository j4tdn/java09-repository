package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students="LeNa, LeTeo, HoagNa, VanTen, LeLy";
		String[] result=getStudents(students, "Le");
		System.out.println(String.join(",", result));
	}
	private static String[] getStudents(String students,String start) {
		String[] ar=students.split(", ");
		String[] result=new String[ar.length];
		int index=0;
		for(String ar1:ar) {
			if(ar1.startsWith(start)) {
				result[index++]=ar1;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
