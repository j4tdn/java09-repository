package sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import static java.util.Comparator.*;
import static utils.ArrayUtils.*;

public class Ex04 {
	public static void main(String[] args) {
		String[] sequences = { "a", "1", "7",null, "c", "5", "k", "b" };

		// tang sort
/*		Arrays.sort(sequences);
		printf(sequences);  
		System.out.println("===========");

		Arrays.sort(sequences, (String o1, String o2) ->{
				return o1.compareTo(o2);
			}
		); */
		
		//nullsLast : in ra giảm dần
		//reverseOrder 
		Arrays.sort(sequences,
				nullsLast(comparing(Function.identity(),
					reverseOrder())));
		printf(sequences);

	}
}
