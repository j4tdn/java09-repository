package exercises;

public class Ex04 {
	public static void main(String[] args) {
		String string = "   Welcome to    JAVA09 class ";
		String[] splitedStrings = string.trim().split("\\s+");
		for(int i = 0; i < splitedStrings.length; i++) {
			StringBuilder tmp = new StringBuilder(splitedStrings[i]);
			splitedStrings[i] = tmp.reverse().toString();
		}
		String result = String.join(" ", splitedStrings);
		System.out.println(result);
		
	}
}
