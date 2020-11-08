package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = "LeNa, LeTeo, HoangNa, VanTeo, LeTa";
		String[] names = getStudents("Le", students);
		System.out.println(String.join(" - ", names));
		
	}
	
	private static String[] getStudents(String prefix, String studens) {
		String[] names = studens.split(", ");

		String[] result = new String[names.length];
		int index = 0;
		for(String name: names) {
			if(name.startsWith(prefix)) {
				result[index++] = name;
			}
		}
		return Arrays.copyOfRange(result, 0, index);
		
	}
}
