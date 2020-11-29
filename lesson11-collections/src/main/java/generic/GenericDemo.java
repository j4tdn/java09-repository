package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<String> list = new JavaList<String>();
		list.add("a");
		list.add("a");
		System.out.println("size: " + list.size());
		System.out.println("empty: " + list.isEmpty());
	}
}
