package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String Object : store in heap memory
		//always create new instance
		String o1 = new String("hello");
		String o2 = new String("welcome");
		String o3 = new String("hello");
		hash(o1);
		hash(o2);
		hash(o3);
		equals(o1,o2);
		equals(o1,o3);
		equals(o2,o3);
		
		
		// String Literals: store in heap - constant pool - memory
		// only create new instance does not exist new value
		System.out.println("==================");
		String l1 = "hi";
		String l2 = "bye";
		String l3 = "hi";
		hash(l1);
		hash(l2);
		hash(l3);
		equals(l1,l2);
		equals(l1,l3);
		equals(l2,l3);
		
		//=> always use literals
		//immutable
		l1="how are you";
		hash(l1);
	}
	
	private static void hash(String string) {
		System.out.println(System.identityHashCode(string));
	}
	
	private static void equals(String s1, String s2) {
		//compare value at stack
		System.out.println(s1==s2);
	}
}
