package exception;

import java.util.function.Function;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences = {"a", "b","c"};
		print(sequences, String::toUpperCase);	//sequence->sequence.up..
		//class A getMethod()->method
		//A a.getmethod =>A::getMethod
		
		
	}
	private static void print(String[] sequences, Function<String, String> function ) {
		if(sequences==null || function ==null) {
			throw new NullPointerException();						//throw quang loi va dung chuong trinh
		}
		for(String sequence: sequences) {							//co ngoai le khi ca chuoi null
			System.out.println(function.apply(sequence));			// co phan tu null {"a", null, "b"}
		}
		
	}

}
