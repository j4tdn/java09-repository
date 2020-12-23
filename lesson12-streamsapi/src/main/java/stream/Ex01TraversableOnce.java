package stream;

import java.util.Arrays;

public class Ex01TraversableOnce {
	public static void main(String[] args) {
		int[] digits= {1,3,8,4,9};
		//get odd elements
		 
		//convert to stream
		int[] result=Arrays.stream(digits).filter(t -> t%2==1).toArray();
		
	//	stream.forEach(digit ->System.out.println(digit));
		
		Arrays.stream(result).forEach(System.out::println);
	}
}
