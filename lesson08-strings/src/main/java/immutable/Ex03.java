package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s ="SGK123";
		String s1 = "SGK";
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));
		String s3 = "  cheers from       da nang";
		// loai bo khoang trang thua 2 dau
		System.out.println(s3.trim());
		//loai bo dau
	//	System.out.println("leading:" + s3.stripLeading());
		//loai bo cuoi
		//System.out.println("trailing " + s3.stripTrailing());
		// cat full 
		System.out.println("================");
		System.out.println("replaceall: " + s3.trim().replaceAll("\\s{1,}", "-"));
		
		}
		
}
