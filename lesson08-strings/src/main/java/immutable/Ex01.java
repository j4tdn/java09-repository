package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String object :store in heap memory, always create instance
		String o1 = new String("Hello");
		String o2 = new String("Welcome");
		String o3 = new String("hello");
		hash(o1);
		hash(o2);
		hash(o3);
		System.out.println("-----------------");
		// String literals: store in heap constant pool memory
		// only create instance does not exist new value
		String l1 = "hi";
		String l2 = "bye";
		String l3 = "hi";
		hash(l1);
		hash(l2);
		hash(l3);
		equals(o1, o2);
		equals(o2, o3);
		equals(o1, o3);
		equals(l1, l2);
		equals(l1, l3);
		equals(l2, l3);
		l1="how are you";
		hash(l1);

	}

	private static void hash(String string) {
		System.out.println(System.identityHashCode(string));
	}

	private static void equals(String s1, String s2) {
		System.out.println(s1 == s2);
	}

}
