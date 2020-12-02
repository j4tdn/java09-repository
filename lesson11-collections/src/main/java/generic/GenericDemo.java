package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<String> list = new JavaList<>();
		list.add("welcom a");
		list.add(null);
		list.add("welcom b");
//		System.out.println("size: " + list.size());
//		System.out.println("empty: " + list.isEmpty());
		System.out.println(list.count(e -> e.startsWith("welcom")));
		
	}
}
