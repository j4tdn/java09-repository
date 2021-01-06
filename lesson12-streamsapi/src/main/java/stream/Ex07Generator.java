package stream;
import java.util.stream.*;
public class Ex07Generator {
//	Rarely use
	public static void main(String[] args) {
//	value=> stream
//	array => stream
//	collection => stream
//	rarely use:iterate, generator
		Stream.iterate(0, n -> n + 2).limit(20).toArray(Integer[]::new);
		
	Stream<int[]> stream=Stream.iterate(new int[] {0,1},t-> new int[] {t[1],t[0]+t[1]}).limit(20);
	stream.forEach(a->{System.out.println(a[0]+","+a[1]);
	});	
	}
}
