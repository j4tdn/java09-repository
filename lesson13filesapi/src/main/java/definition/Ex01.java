package definition;

import java.io.File;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex01 {
	//ex01: create file current project data.txt
	public static void main(String[] args) throws Exception {
		File file=createFile("data.txt");
		
		//info file
		System.out.println("Name:"+file.getName());
		System.out.println("Path:"+file.getPath());//ddtd
		System.out.println("PathAbso:"+file.getAbsolutePath());//ddtd
		System.out.println("PathCano:"+file.getCanonicalPath());
		
		Path path=Paths.get("info.txt");
		Files.createFile(path);
		
		System.out.println("Name:"+path.getName(0));
	}
	
	private static File createFile(String path) {
		File file=new File(path);
		boolean isSuccess=false;
		if(!file.exists()) {
			try {
				isSuccess=file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		if(!isSuccess) {
			System.out.println("Cannot create file "+file.getName()+" is existed");
		}
		return file;
	}
}
