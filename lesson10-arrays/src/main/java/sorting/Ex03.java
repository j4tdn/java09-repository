package sorting;

import static util.ArraysUtils.*;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		String[] sequences = { null, "a", "1", "7", "c", null, "k", "b", "5" };

		Arrays.sort(sequences, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// null first
				if (o1 == null) {
					return -1;//hoán vị trước
				}
				if (o2 == null) {
					return 1;//hoán vị sau
				}
				return o1.compareTo(o2);// neu muon giam dan thi hoan doi o1 vs o2
			}
		});
		printf(sequences);
	}
}
