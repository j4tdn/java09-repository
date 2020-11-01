package immutable;

public class Ex01 {
	public static void main(String[] args) {
		// String Object : store in heap memory
		// always create new instance
		String o1 = new String("Hello");
		String o2 = new String("welcome");
		String o3 = new String("Hello");
		hash(o1);
		hash(o2);
		hash(o3);
		equals(o1, o2);
		equals(o1, o3);
		equals(o2, o3);
		System.out.println("==================");

		// String literals : store in head - constant pool - memory
		// only create new instance does not exist new value

		String l1 = "hi";
		String l2 = "bye";
		String l3 = "hi";
		hash(l1);
		hash(l2);
		hash(l3);
		equals(l1, l2);
		equals(l1, l3);
		equals(l2, l3);
		//luon dung string literal
		//immutable: bất biến giá trị ô nhớ trên Heap: ( luôn tạo ô nhớ mới ( trừ t/h có sẵn giá trị trên constant pool)

	}

	private static void hash(String string) {
		System.out.println(System.identityHashCode(string));
	}
	private static void equals(String s1 , String s2) {
		//compare value at stack
		System.out.println(s1==s2);
		
		
	}

}
