package sorting;
import static utils.ArrayUtils.*;
public class Ex02 {
	public static void main(String[] args) {
		String[] sequences = { "a", "1", "7", null, "c", "5", "k", "b" };
		bubbleSort(sequences);
		printf(sequences);
	}
}
