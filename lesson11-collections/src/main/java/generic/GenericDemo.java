package generic;

public class GenericDemo {
	public static void main(String[] args) {
		Ilist<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(10);
		digits.add(10);
		digits.add(10);
		System.out.println("Size:" + digits.size());
		System.out.println("empty:" + digits.isEmpty());
		Ilist<String> items = new JavaList<>();
		items.add("welcome to java09");	
		items.add("cheers from java09");
		items.add("hello from java09");
		System.out.println(items.count(item -> item.startsWith("welcome")));
		System.out.println(items.size());

		
	}

}
