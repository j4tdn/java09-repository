package hashcodeequals;

public class HashCodeDemo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		
		hashcode(s1);
		hashcode(s2);
		
		identityHashCode(s1);
		identityHashCode(s2);
	}
	private static void hashcode(String s) {
		System.out.println(s.hashCode());
	}
	
	private static void identityHashCode(String s) {
		System.out.println(System.identityHashCode(s));
	}
}
