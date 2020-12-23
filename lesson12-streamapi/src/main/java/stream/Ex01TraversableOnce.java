package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01TraversableOnce {

	public static void main(String[] args) {
		int[] digits = {1,3,4,8,0};
		//get odd elements
		//covert to stream
		IntStream stream= Arrays.stream(digits);
		
		
		int[] result=Arrays.stream(digits).filter(digit-> digit%2 !=0).toArray();
		Arrays.stream(result).forEach(System.out::println);	
		
		
	}
}
