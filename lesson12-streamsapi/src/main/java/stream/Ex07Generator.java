package stream;

import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Ex07Generator {
	
	public static void main(String[] args) {
		// values => stream
		// array => stream
		// collection => stream
		// Rarely use: iterate, generate
		
		// infinitive stream
		Stream.iterate(0, n -> n + 2)
			  .limit(10) 
			  .toArray(Integer[]::new);
				
		System.out.println("max: " + Integer.MAX_VALUE);
		
		Stream.iterate(
				new long[] {0, 1}, 
				t -> new long[] {t[1], t[0] + t[1]})
				.limit(10)
				.forEach(a -> {
					System.out.println(a[0] + ", " + a[1]);
				});
	}
}
