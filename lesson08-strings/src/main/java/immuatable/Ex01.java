package immuatable;

public class Ex01 {
	public static void main(String[] args) {
		//string object 
		//always create new instance 
		String o1 = new String("hello");
		String o2 = new String("wellcome");
		String o3 = new String("hello");
		hash(o1);
		hash(o2);
		hash(o3);
		equal(o1, o2);
		equal(o2, o3);
		equal(o1, o3);
		//string Literals : store in heap - constant pools - memor 
		//only create  new instance does not exits  new value 
			System.out.println("======================");
		String l1 = "hi";
		String l2 = "bye ";
		String l3 = "hi";
		hash(l1);
		hash(l2);
		hash(l3);
		equal(l1, l2);
		equal(l2, l3);
		equal(l1, l3);
		// string literals 
		//immutable
		l1="how are you";
		hash(l1);
		
		
	}	
		public static void hash(String string) {
			System.out.println(System.identityHashCode(string));
		}
		//compare value at stack
		public static void equal(String s1, String s2) {
				System.out.println(s1==s2);
		}
	}

