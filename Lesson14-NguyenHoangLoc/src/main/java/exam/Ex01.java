package exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,5,6,4,3,2,1,1,2,3,4,5);
		//cau 1
	    number.stream().distinct().forEach(System.out::println);
	   
		
	}
}
