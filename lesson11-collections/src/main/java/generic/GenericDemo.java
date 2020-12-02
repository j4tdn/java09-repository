package generic;

public class GenericDemo {
	public static void main(String[] args) {
		IList<Integer> digits = new JavaList<>();
		digits.add(10);
		digits.add(10);
		digits.add(10);
		digits.add(10);
		System.out.println("size:" + digits.size());
		System.out.println("empty:" + digits.isEmpty());
		
		System.out.println("=====================");
		IList<String> strings = new JavaList<String>();
		strings.add("welcome to java09");
		strings.add("cheer from java09");
		strings.add("hello from java 09");
		strings.add(null);
		int result1  = strings.count(t-> t.startsWith("welcome"));
		System.out.println(result1);
		
		int result2 = strings.count(t-> true);
		System.out.println(result2);
	}
}