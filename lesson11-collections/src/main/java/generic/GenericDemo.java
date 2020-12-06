package generic;

import java.util.List;

public class GenericDemo {
public static void main(String[] args) {
	IList<Integer> digits= new JavaList<Integer>();
	digits.add(10);
	digits.add(10);
	digits.add(10);
	digits.add(10);
	digits.add(10);
	System.out.println("size: "+digits.size());
	System.out.println("empty: "+digits.isEmpty());
IList<String> items= new JavaList<>();
items.add("welcome to Java09");
items.add("cheers from Java09");
items.add("hello to Java09");
System.out.println(items.count(item ->item.startsWith("welcome")));
System.out.println(items.size());
}
}
