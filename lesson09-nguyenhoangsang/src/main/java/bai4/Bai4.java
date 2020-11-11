package bai4;

public class Bai4 {
	public static void main(String[] args) {
		String str = "   Welcome to DaNang  City   !!   ";
		System.out.println("Ket qua la : " + revert(str));
	}
	public static String revert(String s) {
		String result = "";
		String str = s.trim().replaceAll("\\s++"," ");
		String[] arr = str.split(" ");
		for(String word : arr) {
			result = result + revertString(word) + " ";
		}
		return result ;
	}
	public static String revertString(String s) {
		String result = "";
		for(int i = s.length()-1 ; i>=0 ; i--){
			result = result + s.charAt(i);
		}
		return result;
	}
}
