package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		
		IList<String> items = new JavaList<String>();
		items.add("welcome to java09");
		items.add("cheers from java09");
		items.add("hello from java09");
		
		System.out.println(items.count(item -> item.startsWith("welcome")));
		System.out.println(items.size());
	}
}
