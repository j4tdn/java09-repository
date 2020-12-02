package generic;

public class GenericDemo {
	public static void main(String[] args) {
		Ilist<Integer> digits = new JavaList<Integer>();
		digits.add(10);
		digits.add(10);
		digits.add(10);
		
		System.out.println("size "+ digits.size());
	
		System.out.println("empty "+ digits.isEmpty());
		Ilist<String> items = new JavaList<>();
		items.add("wellcome to java09");
		items.add("cheer to java09");
		items.add("hello to java09");
		//items.count(item -> item.startsWith("wellcome"));
		System.out.println(items.count(item -> item.startsWith("wellcome")));
		System.out.println(items.size());
	}
	
}
