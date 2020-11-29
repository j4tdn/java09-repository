package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(10);
		digits.add(1);
		digits.add(0);
		
		System.out.println("size: " + digits.size());
		System.out.println("empty: " + digits.isEmpty());
		
		
	}
}
