package collections.utils;

import java.util.List;

public class ListUtils {
private ListUtils(){
	
}

public static void printf(List<String> sequences) {
	for (String sequence : sequences) {
		System.out.println(sequence);
	}
}
public static void printfInteger(List<Integer> numbers) {
	for (Integer number : numbers) {
		System.out.print(numbers+"  ");
	}
	System.out.println("");
}
}
