package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "SGK123";
		String s1 = "SGK";
		String s2 ="sgk";
		System.out.println(s.startsWith(s1));
		System.out.println(s.replaceAll(s1, s2));
		String s3 = "  a  a a  ";
		//loại bỏ khoảng trắng 2 đầu
		System.out.println(s3.trim());
		
		//loại bỏ đầu
		System.out.println(s3.stripLeading());
		
		//loại bỏ cuối
		System.out.println(s3.stripTrailing());
		
		//cắt full
		System.out.println(s3.trim().replaceAll("\\s+", " "));
		
	}
}
