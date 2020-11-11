package immuatable;

public class Ex03 {
public static void main(String[] args) {
	
	String s1 = "SGK123";
	String s2 = "SGK";
	System.out.println(s1.startsWith("SGK"));
	System.out.println(s1.endsWith("SGK"));
	String s="wellcome to class";
	String s3 = "class";
	String s4 = "club";
	System.out.println(s.replace("class", "club"));
	String s5 = "cheers from danang";
	String s6 = "     cheers    from       danang     ";
	System.out.println(s5.substring(7));
	
	System.out.println(s6.trim());
	//loai bo dau
	System.out.println(s6.stripLeading());
	//loaiabocuoi
	System.out.println(s6.stripTrailing());
	System.out.println(s6.trim().replaceAll("\\s{1,}"," "));
}
	
}
