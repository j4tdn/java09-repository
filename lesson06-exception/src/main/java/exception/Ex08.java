package exception;

import java.util.function.Function;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences= {"a","b","c"};
		print(sequences, String::toUpperCase);
	}

	private static void print(String[] sequeces,Function<String, String> function) {
		if(sequeces==null|| function==null) {
			throw new NullPointerException();
		}
		
		for(String sequece: sequeces) {
			System.out.println(function.apply(sequece));
		}
		
	}
}
