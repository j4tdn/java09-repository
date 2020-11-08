package immutable;

public class Ex05 {
	//get unique Numbers
	public static void main(String[] args) {
		String input = "1, 2, 3, 2";
		System.out.println(getUniqueNumbers(input));
	}
	
	private static String getUniqueNumbers(String input) {
		StringBuilder result= new StringBuilder("");
		String[] numbers=input.trim().split(", ");
		//default=false
		boolean[] flags= new boolean[numbers.length];
		for(int out=0; out<numbers.length;out++) {
			if(!flags[out]) {
				for(int in=0; in<numbers.length;in++) {
					if(numbers[out].equals(numbers[in])) {
						flags[out]=true;
						flags[in]=true;
					}
				}
			}
			
			if(!flags[out]) {
				result.append(numbers[out] + ", ") ;
			}
		}
		return result.toString();
	}

}
