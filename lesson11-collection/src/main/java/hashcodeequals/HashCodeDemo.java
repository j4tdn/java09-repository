package hashcodeequals;

public class HashCodeDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";

		hashcode(s1);
		hashcode(s2);

		identityhashcode(s1);
		identityhashcode(s2);
	}

	private static void hashcode(String S) {
		System.out.println(S.hashCode());
	}

	private static void identityhashcode(String S) {
		System.out.println(System.identityHashCode(S));
	}
}
