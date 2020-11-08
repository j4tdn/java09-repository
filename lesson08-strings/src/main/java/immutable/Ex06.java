package immutable;

public class Ex06 {
	public static void main(String[] args) {
		String students = "LeNa, LeTeo, HoangNa, VanTeo, LeTa";
	}
	
	private static String[] getStudentsStartWith(String students, String prefix) {
		int index = 0;
		String[] ar = students.trim().split(", ");
		String[] result = new String[ar.length];
		for(int i = 0; i < ar.length; i++) {
			if(ar[i].startsWith(prefix)) {
				result[index] = ar[i];
				index++;
			}
		}
		return result;
	}
}
