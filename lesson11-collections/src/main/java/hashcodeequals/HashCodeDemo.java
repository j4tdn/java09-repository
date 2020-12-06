package hashcodeequals;

public class HashCodeDemo {
	public static void main(String[] args) {
		//hashcode, identityHashCode
		String s1 = "hello";
		String s2 = new String("hello") ;
		hashcode(s1);
		hashcode(s2);
		identityhashcode(s1);
		identityhashcode(s2);
		System.out.println(s1==s2);
		
	}
	
	private static void hashcode(String s) {
		System.out.println(s.hashCode());
	}
	private static void identityhashcode(String s) {
		System.out.println(System.identityHashCode(s));
	}

}
