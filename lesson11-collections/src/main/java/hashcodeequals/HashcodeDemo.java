package hashcodeequals;

public class HashcodeDemo {
	public static void main(String[] args) {
		//hashcode, identityHashcode
		
		String s1="hello";
		String s2="hello";
		
		hashcode(s1);//tao gia tu gia tri doi tuong
		hashcode(s2);
		
		identityHashcode(s1);//dia chi
		identityHashcode(s2);
		
		System.out.println(s1==s2);
		
	}
	private static void hashcode(String s) {
		System.out.println(s.hashCode());
	}
	
	private static void identityHashcode(String s) {
		System.out.println(System.identityHashCode(s));
	}
}
