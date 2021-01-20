package lesson14;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Ex01 {
	public static void main(String[] args) {
		int[] ip = {1,2,3,4,5,6,5,5,3,1};
		
		 Arrays.stream(ip).distinct().
+		 .forEach(System.out::println);
		
		
		
		
}

	
}
