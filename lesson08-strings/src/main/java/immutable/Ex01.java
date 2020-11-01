package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// string object : store in heap memory
		// always create new instance
		String o1 = new String("hello");
		String o2 = new String("Welcome");
		String o3 = new String("hello");
		hash(o1);
		hash(o2);
		hash(o3);
		equal(o1, o2);
		equal(o1, o3);
		equal(o2, o3);
		
		System.out.println("========================");
		
	// string literal : store in heap : constant pool memory
		// only create new instance doesn't exist new value
		String l1 = "hi";
		String l2 = "bye";
		String l3 = "hi";
		hash(l1);
		hash(l2);
		hash(l3);
		equal(l1, l2);
		equal(l1, l3);
		equal(l2, l3);
		// => string literal
		l1 = "how are you";
		hash(l1);
	}
	
	private static void hash (String string) {
		System.out.println(System.identityHashCode(string));
	}
	private static void equal (String s1,String s2) {
		System.out.println(s1==s2);
	}
}
