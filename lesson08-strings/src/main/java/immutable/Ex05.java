package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "1,2,2,3,15";
		// 121231
		System.out.println(getUniqueNumbers(s));
	}
	
	private static String getUniqueNumbers(String input) {
		String result = "";
		String ss = input.replaceAll(",", "");
		System.out.println(ss);
		String[] s = input.split(",");
		for (String string : s) {
			if(input.indexOf(string) == input.lastIndexOf(string)){
				result += string + " ";
			}
		}
		return result;
	}
}
