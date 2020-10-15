package exception;

public class Ex08 {
	public static void main(String[] args) {
		String[] sequences= {"a","b","c"};
		print(sequences,String::toUpperCase);
	}
	private static void print(String[] sequences, Function<String,String> function) {
		if(sequences==null||function==null) {
			throw new NullPointerException();
		}
		for(String sequence:sequences) {
			System.out.println(function.apply(sequence));
		}
	}
}
