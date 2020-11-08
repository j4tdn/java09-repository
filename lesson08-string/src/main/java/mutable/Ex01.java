package mutable;

public class Ex01 {
	public static void main(String[] args) {
		String s1="java09";
		hash("s1",s1);
		StringBuilder s2=new StringBuilder("jav90");
		s1+="lesson08";
		hash("s1",s1);
		hash("s2",s2);
		s2.append("lesson80");
		hash("s2",s2);
		
	}
	private static void hash(String s,CharSequence input) {
		System.out.println(s+":"+System.identityHashCode(input));
	}
}
