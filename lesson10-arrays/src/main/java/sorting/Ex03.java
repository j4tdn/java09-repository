package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static utils.ArrayUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		String[] sequences = { "a", "1", null, "7", "c", null, "5", "k", "b" };
		// T : parameterized type(generic from java 1.5)
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1==null) {
					return -1;
				}
				if(o2 ==null) {
					return 1;
				}
				return o1.compareTo(o2);
				
				
			}
		});

		printf(sequences);

	}

}
