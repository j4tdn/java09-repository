package exam;

public class Ex04 {

	public static void main(String[] args) {
		String input="  Hello   vIet Nam    ";
		System.out.println(revert(input));

	}
	
	private static String revert(String input) {
		String result="";
		input=input.trim();
		String[] spl=input.split("[\\s]+");
		for(String i : spl) {
			result+=chuoiDao(i)+" ";
		}
		
		
		
		return result.trim();
		
	}
	private static String chuoiDao(String i) {
		char[] c=i.toCharArray();
		String result="";
		for(int index=c.length-1;index>=0;index--) {
			result+=c[index];
		}
		return result;
	}

}
