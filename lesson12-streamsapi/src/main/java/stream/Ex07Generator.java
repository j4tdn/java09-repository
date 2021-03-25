package stream;

import java.util.function.IntFunction;
import java.util.stream.Stream;

import javax.naming.LimitExceededException;
import javax.xml.transform.stream.StreamSource;

public class Ex07Generator {
	// Rarely use
	public static void main(String[] args) {
		//values => stream
		// array => stream
		// collection => stream
		// Rarely use iterate, generate
		
		// infinitive stream
		Stream.iterate(0, n -> n + 2)
		.limit(10)
		.toArray(new IntFunction<Integer[]>() {

			@Override
			public Integer[] apply(int size) {
				System.out.println("size: " + size);
				return new Integer[size];
			}
			
		});
		
	}
}
