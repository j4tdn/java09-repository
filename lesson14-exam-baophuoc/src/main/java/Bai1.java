import java.util.Arrays;
import java.util.stream.IntStream;

public class Bai1 {
	public static void main(String[] args) {
		int[] digits= {1,2,3,4,5,6,5,3,1};


			int[] result = Arrays.stream(digits)
					.distinct()
					.toArray();
			
					
			System.out.println(result.length);
			Arrays.stream(result)
			.forEach(System.out::println);

		}
	
}
