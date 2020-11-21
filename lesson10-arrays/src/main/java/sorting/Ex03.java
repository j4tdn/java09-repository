package sorting;

import utils.ArraysUtils;
import static utils.ArraysUtils.*;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] sequences = { "a", "1", "7",null, "c", "b", "k" };
		Arrays.sort(sequences,new Comparator<String>() {

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
		print(sequences);
	}
}
