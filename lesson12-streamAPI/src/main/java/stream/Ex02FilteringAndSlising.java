package stream;

import java.util.Arrays;
import java.util.regex.Pattern;

import com.sun.tools.javac.util.List;

import bean.Apple;
import service.AppleService;
import service.AppleServiceimpl;

public class Ex02FilteringAndSlising {
	private static AppleService service;

	static {
		service = new AppleServiceimpl();
	}
	public static void main(String[] args) {
		String[] data = Pattern.compile("[,\\s]+").splitAsStream("a,b,c,d")

				.distinct()
				.skip(1)
				.limit(3)
				.toArray(String[]::new);				;
//		Arrays.stream(data).forEach(item->SystemAppleprintln(item+" "));


		java.util.List<Apple> inventory=service.getAll();
		inventory.
		stream()
		.distinct()
		.forEach(System.out::println);
	}
}