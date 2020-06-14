package operator;

public class Ex01 {
	public static void main(String[] args) {
		int a = 7;
		if(isEVen(a)) {
			System.out.println("Chẵn");
		} else {
			System.out.println("Lẻ");
		}
	}
	
	private static boolean isEVen(int a) {
		return (a % 2 == 0);
	}
}
