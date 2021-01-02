package stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import bean.Apple;
import service.AppleService;

public class Ex02FilteringAndSlicing {
public static void main(String[] args) {
	String[] data=Pattern.compile("[,\\s]+").splitAsStream("a,b,c,d,b,c,d,c").distinct()
			.limit(2)
			.skip(2)
			.toArray(String[]::new);
	System.out.println("Length: "+data.length);
	Arrays.stream(data).forEach(item->System.out.print(item+" "));
	System.out.println("\n==================");
//	List<Apple> inventory=service.getAll();
//	inventory.forEach(System.out::print);
//	homework:distinct by color, origin.
}
}