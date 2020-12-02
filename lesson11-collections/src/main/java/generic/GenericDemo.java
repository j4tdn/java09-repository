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

		IList<String> items = new JavaList<>();
		items.add("welcome to java09");
		items.add("cheers from java09");
		// 4items.add("hello from java09");

		System.out.println("count items start with welcome: " + items.count(item -> item.startsWith("welcome")));
		System.out.println("count elements: " + items.size());
	}
}
