package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "SGK123";
		String s1 = "SGK";
		//System.out.println("start: " + (s.indexOf(s1) == 0) + ", end: " + (s.indexOf(s1)== s.length()-s1.length()-1));
		System.out.println("1: start: " + s.startsWith(s1) + ", end: " + s.endsWith(s1));
		
		s = "welcome to our class";
		s1 = "class";
		String s2 = "club";
		System.out.println("2: "+ s.replace(s1, s2));
		
		String s3 ="  cheers   from      Da Nang  ";
		System.out.println("3: " + s3.trim().replaceAll("\\s+", " "));
		//Loai bo khoang trang dau: stripLeading()
		//Loai bo khoang trang cuoi: stripTrailing()
		
		System.out.println("4: " + s.substring(6));
		
	}
}
