package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String Objects: store in heap memory
		// always new instance
		String o1 = new String("Hello");
		String o2 = new String("welcom");
		String o3 = new String("Hello");
		hash(o1);
		hash(o2);
		hash(o3);
		equals(o1,o2);
		equals(o1,o3);
		equals(o2,o3);

		// String Literals: store in heap - constant pool - memory
		// only create new instance does not exits new value
		String l1 = "hi";
		String l2 = "bye";
		String l3 = "hi";
		hash(l1);
		hash(l2);
		hash(l3);
		equals(l1,l2);
		equals(l1,l3);
		equals(l2,l3);
		
		// => string literal
		// immutable: bất biến ô nhớ ở heap 
		l1 = "how are u";
		hash(l1);

	}

	private static void hash(String string) {
		System.out.println(System.identityHashCode(string));
	}
	
	private static void equals(String s1, String s2) {
		// == so sánh ở stack
		System.out.println(s1 == s2);
	}
}
