package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "welcome to our class".replace("class", "clup");
		String s1 = "class";
		String s2 = "clup";
		String s3 = "   Cheers   from   Da        Nang ";
		// loai bỏ khoảng trắng thừa 2 đầu 
		System.out.println(s3.trim());
		
		// loại bỏ đầu
		System.out.println("leading: " + s3.stripLeading());
		
		//loại bỏ cuoois
		System.out.println("trailing : " + s3.stripTrailing());
		
		//cắt full
		// \\s{1,} = \\s+ pattern 1 || n spaces
		System.out.println("replaceAll : " + s3.replaceAll("\\s{1,}", "-"));
		
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));

	}
	
}
