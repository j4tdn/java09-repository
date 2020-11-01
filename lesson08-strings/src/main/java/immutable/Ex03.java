package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "   fdhg    dfhghfd hfgh   fdgh   ";
		
		String s1 = " ";
		System.out.println(s.startsWith(s1) && s.endsWith(s1) ? "Yes" : "No");
		
		
		String s3 = s.trim().replaceAll("\\s+", " ");
		System.out.println(s3);
		
		String s4 = s.substring(6);
		System.out.println(s4);
		
		System.out.println(s.stripLeading());
		System.out.println(s.stripTrailing());
	}
}
