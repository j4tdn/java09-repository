package immutable;

public class Ex01 {
	public static void main(String[] args) {
		//String object:store in heap memory
		//always create new instance
		String o1=new String("Hello");
		String o2=new String("Welcome");
		String o3=new String("hello");
		hash(o1);
		hash(o2);
		hash(o3);
		equal(o1,o2);
		equal(o1,o3);
		equal(o2, o3);
		System.out.println("===========");
		//String literals:store in heap-constant pool memory
		//only create new instance does not exist new value
		String l1="hi";
		String l2="bye";
		String l3="hi";
		equal(l1,l2);
		equal(l1,l3);
		equal(l2, l3);
		
		
		//=>String literal
		//immutable
		
		l1="how are u";
	}
	private static void hash(String string) {
		System.out.println(System.identityHashCode(string));
	}
	private static void equal(String s1,String s2) {
		//compare value at stack
		System.out.println(s1==s2);
	}
}
