package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex03 {
	public static void main(String[] args) {
		String s = "aaaababbbddc";
		System.out.println(getResult(s));
	}

	public static String getResult(String s) {
		char[] elements = s.toCharArray();
		List<String> list = new ArrayList<>();
		for (char c : elements) {
			list.add(String.valueOf(c));
		}
		return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue())).findFirst().get().getKey();
	}
}
