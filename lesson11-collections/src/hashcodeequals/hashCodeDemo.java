package hashcodeequals;

public class hashCodeDemo {
public static void main(String[] args) {
	String s1 = "hello";
	String s2 = "hello";
	String s3 = new String("hello");
	
	hashcode(s1);
	hashcode(s3);
	
	identityHashcode(s1);
	identityHashcode(s3);
	
}

private static void hashcode(String s) {
	System.out.println(s.hashCode());
}

private static void identityHashcode(String s) {
	System.out.println(System.identityHashCode(s));
}
}
