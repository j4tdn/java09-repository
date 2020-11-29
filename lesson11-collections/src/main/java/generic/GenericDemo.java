package generic;

public class GenericDemo {
	public static void main(String[] args) {
		Ilist<Integer> digits = new JavaList<>();
		digits.add(10);
		System.out.println("Size:" + digits.size());
		System.out.println("empty:" + digits.isEmpty());
	}

}
