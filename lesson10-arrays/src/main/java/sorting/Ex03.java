package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static utils.ArrayUtils.*;
public class Ex03 {
	public static void main(String[] args) {
		String[] sequences= {"a","2","c",null,"k","5","1",null,"b"};
		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1==null) {
					return -1;
				}
				if(o2==null) {
				     return 1;
				}
				return o1.compareTo(o2);
			}
		});
		printf(sequences);
	}
}
