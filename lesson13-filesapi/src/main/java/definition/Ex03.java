package definition;

import java.io.File;
import java.io.IOException;

public class Ex03 {
public static void main(String[] args) {
	File file =Create("apple"+File.separator+"data.txt");
	System.out.println("file: "+file.getName());
	
}

private static File Create(String path) {
	boolean isSuccess=false;
	File file = new File(path);
	File parent= file.getParentFile();
	if (!parent.exists())
	{
		parent.mkdirs();
		
	}
	if (!file.exists()) {
		try {
			isSuccess=file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	if (!isSuccess)
	{
		System.out.println(file.getName()+" is existed");
	}
	return file;
}
}
