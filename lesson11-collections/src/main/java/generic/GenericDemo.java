package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(20);
		digits.add(30);
		digits.add(40);
		digits.toString();
		
		System.out.println("size: " + digits.size());
		System.out.println("empty: " + digits.isEmpty());
	
		IList<String> items = new JavaList<>();
		items.add("welcome to Java09");
		items.add(null);
		items.add("cheers from Java09");
		// items.add("hello from Java09");

		System.out.println("===========");
		System.out.println(items.count(item -> item.startsWith("welcome")));
		System.out.println(items.size());
	}
}
