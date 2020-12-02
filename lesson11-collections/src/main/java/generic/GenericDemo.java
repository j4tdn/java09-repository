package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(20);
		
		digits.add(30);
		digits.add(10);
		System.out.println("size: " + digits.size());
		System.out.println("empty: " + digits.isEmpty());
		IList<String> items = new JavaList<>();
		items.add("welcome to java099");
		items.add("cheers from java099");
		items.add("hello from java099");
		
		System.out.println("=========");
		System.out.println(items.count(item -> item.startsWith("welcome")));
		System.out.println(items.size());
	}
}
