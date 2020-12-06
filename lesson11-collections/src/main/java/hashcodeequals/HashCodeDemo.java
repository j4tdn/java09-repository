package hashcodeequals;

public class HashCodeDemo {
 public static void main(String[] args) {
	//hashcode, identityHashCode
	 String s1 = "Hello";
	 String s2 ="Hello";
	 
	 hashcode(s1);
	 hashcode(s2);
	 indentityhascode(s1);
	 indentityhascode(s2);
}
 private static void hashcode(String s) {
	 System.out.println(s.hashCode());
 }
 
 private static void indentityhascode(String s) {
	 System.out.println(System.identityHashCode(s));
 }
}
