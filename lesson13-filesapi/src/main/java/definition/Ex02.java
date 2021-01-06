package definition;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		File file =  new File("apple");
		if ( !file.exists()) {
			file.mkdirs();	
		}
		System.out.println("create file success");
	}
}
