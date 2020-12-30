package hashcodeequals;

public class HashCodeDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		
		hashCode(s1);
		hashCode(s2);
		
		identityHashCode(s1);
		identityHashCode(s2);
	}
	
	private static void hashCode(String s) {
		System.out.println(s.hashCode());
	}
	
	private static void identityHashCode(String s) {
		System.out.println(System.identityHashCode(s));
	}
}
