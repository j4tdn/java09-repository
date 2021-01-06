package stream;

import java.util.function.IntFunction;
import java.util.stream.Stream;

public class Ex07Generator {
	public static void main(String[] args) {
		// values -> Stream
		// array-> stream
		//collection -> stream
		// Rarely use: iterate;generate
		
		//infinity stream
		Stream.iterate(0, n -> n+2)
			  .limit(10)
			  .toArray(Integer[]::new);
		
		
		Stream <int[]>stream =Stream.iterate(new int[] {0,1}, 
				t-> new int[] {t[1],t[0]+t[1]})
				.limit(10)
				.forEach(a->{System.out.println(a[0]+","+a[1])}
				;
		}
	}

