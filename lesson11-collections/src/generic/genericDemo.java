package generic;

public class genericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(10);

		digits.add(10);
		digits.add(10);



		System.out.println("size: " + digits.size());
		System.out.println("empty: " + digits.isEmpty());
		
		
		IList<String> items = new JavaList<>();
		items.add("Welcome to Java09");
		items.add("Cheers from Java09");
		items.add("hello Java09");
		
		System.out.println(items.count(item -> item.startsWith("Welcome")));
		System.out.println(items.size());
		
	}

}
