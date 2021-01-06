package stream;

import java.util.stream.Stream;

public class Ex07Generator {
	// rarely use
	public static void main(String[] args) {
		//value -> stream
		//array -> stream 
		//collection -> stream
		//Rarely use: iterate , generate
		
		Stream.iterate(0, n -> n + 2)
			.limit(10)
			.toArray(Integer[]::new);
		Stream.iterate(new long[] {0, 1}, t -> new long[] {t[1], t[0] + t[1]})
									.limit(10)
									.forEach(a -> {
				System.out.println(a[0] +",  " +  a[1]);
			});
	}
	
}
