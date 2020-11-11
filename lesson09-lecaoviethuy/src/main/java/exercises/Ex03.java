package exercises;

public class Ex03 {
	
	private static int[] flags;
	private static char[] characters;
	private static char[] result;
	public static void main(String[] args) {
		String string = "xyz";
		characters = string.toCharArray();
		flags = new int[characters.length];
		result = new char[characters.length];
		
		mix(0);
	}

	private static void mix(int count) {
		if(count == characters.length) {
			System.out.println(result);
		}
		
		for(int i = 0; i < characters.length; i++) {
			if(flags[i] == 0) {
				flags[i] = 1;
				result[count++] = characters[i];
				mix(count);
				count--;
				flags[i] = 0;
			}
		}
		
	}
}
