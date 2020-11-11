package Exam;

public class Bai4 {
	public static void main(String[] args) {
		String input=" Welcome        to JAVA09            class ";
		System.out.println("replace all: "+ input.replaceAll("\\s{1,}", " "));
	      String reverse = new StringBuffer(input.replaceAll("\\s{1,}", " ")).
	      reverse().toString();
	      System.out.println("=====================");
	      System.out.println("truoc khi dao:"+input.replaceAll("\\s{1,}", " "));
	      System.out.println("sau khi dao:"+reverse);

	}
	
}
