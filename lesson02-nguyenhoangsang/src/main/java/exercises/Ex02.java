package exercises;

public class Ex02 {
	public static void main(String[] args) {
		long finalResult = tinhGiaiThua(4) + tinhGiaiThua(7) + tinhGiaiThua(12) + tinhGiaiThua(18);
		System.out.println("Ket qua la : " + finalResult);
	}
	public static long tinhGiaiThua(int n) {
		long result = 1;
		for(int i = 0; i < n ; i ++ ) {
			result = result * (i + 1);
		}
		return result;
	}
}
