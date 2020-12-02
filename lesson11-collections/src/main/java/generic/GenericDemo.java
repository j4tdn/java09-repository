package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<Integer>();
		System.out.println(digits.hashCode());
		digits.add(15);
		digits.add(150);
		digits.add(140);
		digits.add(30);
		System.out.println(digits.size());
		System.out.println(digits.isEmpty());

		IList<String> item = new JavaList<>();
		item.add("hello");
		item.add("wellcome");
		item.add("well");
		item.add("come");

		System.out.println("=============");
		System.out.println(item.count(items -> items.startsWith("hello")));
		System.out.println(item.size());
	}
}
