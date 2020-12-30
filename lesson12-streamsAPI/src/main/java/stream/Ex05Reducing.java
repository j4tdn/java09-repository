package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex05Reducing {
	public static void main(String[] args) {
		List<Integer> digits=Arrays.asList(1,3,5,6);
		Integer sum=digits.stream().reduce(0, (a,b)->a+b);//Integer::sum
		System.out.println("sum="+sum);
		
		System.out.println("==================");
		Optional<Integer> sumOPT=digits.stream().reduce((a,b)->a+b);//a>b ?a:b or Integer::max
		//sumOPT.ifPresent(value->System.out.println(value+" "));
		System.out.println("sum="+sumOPT.orElse(0));

	}
}
