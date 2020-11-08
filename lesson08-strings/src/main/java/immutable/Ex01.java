package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String object store in heap memory
		// always create new instance
		String o1 = new String("hello");
		String o2 = new String("hello");
		String o3 = new String("hello");
		
		hash(o1);
		hash(o2);
		hash(o3);
		
		equals(o1, o2);
		
		// String literal store in heap - constant pool - memory
		// only create new instance does not exist new value
		String l1 = "hi";
		String l2 = "hi";
		String l3 = "hi";
		
		hash(l1);
		hash(l2);
		hash(l3);
		
		equals(l1, l2);
		
	}
	
	private static void hash(String string) {
		System.out.println(System.identityHashCode(string));
	}
	
	private static void equals(String s1, String s2) {
		System.out.println(s1 == s2);
	}
}
