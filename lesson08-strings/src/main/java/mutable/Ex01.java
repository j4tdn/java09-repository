package mutable;

public class Ex01 {
	public static void main(String[] args) {
		//mutable and immutable
		String s1="java09";
		hash("s1", s1);
		s1+=" lesson 08";
		hash("s1", s1);
		System.out.println("s1:"+s1);
		StringBuffer s2=new StringBuffer("java90");
		hash("s2", s2);
		s2.append(" lesson 80");
		hash("s2", s2);
		System.out.println("s2:"+s2);
		
	}
	private static void hash(String s,CharSequence input) {
		System.out.println(s+": "+System.identityHashCode(input));
	}
}
