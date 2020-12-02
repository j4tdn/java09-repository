package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(15);
		
		System.out.println(digits.isEmpty());
		System.out.println(digits.get(0));

		IList<String> list = new JavaList<>();
		list.add("wel");
		list.add("welcome");
		list.add("welcome to my house");
		list.add("hehe");
		
		int result1 = list.count(s -> s.startsWith("welcome"));
		System.out.println("so phan tu bat dau voi 'welcome': " + result1);
		
		int result2 = list.count(s -> s != null && !s.isEmpty());
		System.out.println("so luong phan tu trong list: " + result2);
	}
}
