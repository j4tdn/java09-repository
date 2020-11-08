package immutable;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		String students = "Lena, LeTeo, HoangNa VanTeo, LeThiNu, NguyenA , LeB";
		String[] result = timTenSVBatDauBangLe(students, "Le");
		for(String name : result) {
			System.out.println(name);
		}
	}
	public static String[] timTenSVBatDauBangLe(String students, String StartWith) {
		String[] result = new String[20];
		String s = students.trim().replaceAll("\\s{1,}", "");
		String[] arr = s.split(",");
		int index = 0;
		for(String name : arr) {
			if (name.startsWith(StartWith)){
				result[index++] = name;
			}
		}
		return Arrays.copyOfRange(result, 0,index);
	}
}
