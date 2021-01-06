package stream;

import java.util.stream.Stream;

public class Ex07Generator {
	public static void main(String[] args) {
		// values => stream
		// array => stream
		// collection => stream
		// rarely use: iterate, generate
		
		Stream.iterate(0,  n -> n + 2)
				.limit(10)
				.toArray(Integer[]::new);
		
		Stream.iterate(new int[] {0, 1}, t -> {
									int tmp = t[1];
									t[1] = t[0] + t[1];
									t[0] = tmp;
									return t;
								})
				.limit(10)
				.forEach(t -> System.out.println(t[0] + ", " + t[1]));
	}
}
