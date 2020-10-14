package exception;

import java.util.Scanner;
import java.util.function.Function;

public class Ex08 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] sequences = {"1sd", "df", "fff"};
		print(sequences, String::toUpperCase);
		
	}
	
	private static void print(String[] sequences, Function<String, String> function) {
		if(sequences == null || function == null) {
			throw new NullPointerException();
		}
		for(String sequence : sequences) {
			System.out.println(function.apply(sequence));
		}
	}
}
