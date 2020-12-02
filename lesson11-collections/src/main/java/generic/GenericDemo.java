package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		System.out.println("Size: " + digits.size());
		System.out.println("is empty: " + digits.isEmpty());
		
		
		IList<String> items= new JavaList<>();
		items.add("welcome to Java09");
		items.add("welcome to Java09");
		items.add("hello to Java09");
		
		System.out.println(items.count(item-> item.startsWith("welcome")));
		System.out.println(items.size());
		
	}
}
