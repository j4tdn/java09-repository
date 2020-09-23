import java.util.Scanner;
import java.util.regex.Pattern;

public class G {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a ="caaaaabbvv";
		String b = a.substring(a.indexOf("aa", 0), a.lastIndexOf("b", 0));
		System.out.println(b);

	}

}
