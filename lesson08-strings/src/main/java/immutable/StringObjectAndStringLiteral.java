package immutable;

public class StringObjectAndStringLiteral {
	public static void main(String[] args) {
		//String objects:"Hello" Store in heap memory,and s1,s2,s3 store in stack
		//Always create new instances
		String s1 = new String("Hello");
		String s2 = new String("Welcome");
		String s3 = new String("Hello");
		hash(s1);
		hash(s2);
		hash(s3);
		equals(s1, s2);
		equals(s1, s3);
		equals(s2, s3);
		
		System.out.println("==================================");
		//String literals:"hi" store in heap-constantpool memory
		//only create instance if it not already exist in memory
		String l1 = "hi";
		String l2 = "bye";
		String l3 = "hi";
		hash(l1);
		hash(l2);
		hash(l3);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		equals(l1, l2);
		equals(l1, l3);
		equals(l2, l3);
	}
	
	private static void hash(String string) {
		System.out.println(System.identityHashCode(string));
	}
	private static void equals(String s1,String s2) {
		System.out.println(s1==s2);
	}
}
