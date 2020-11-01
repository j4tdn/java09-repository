package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "SGK123";
		String s1 = "SGK";
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));

		s = "Welcome to our class";
		s = s.replace("class", "club");
		System.out.println(s);

		String s3 = "  cheer  from  Da    Nang   ";
		System.out.println(s3.trim());
		System.out.println("leading:" + s3.stripLeading());
		System.out.println("trailing:" + s3.stripTrailing());
		System.out.println(s3.trim().replaceAll("\\s+"," " ));

		System.out.println(s.substring(6));
	}
}
