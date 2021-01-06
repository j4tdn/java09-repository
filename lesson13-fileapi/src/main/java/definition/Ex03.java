package definition;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		File file=createFile("apple"+File.separator+"data.txt");
		System.out.println("file:"+file.getName());
		//delete
		//file.delet()
		//file.renameTo()
		//Files.copy()
		//File.move()
	}
	private static File createFile(String path) {
		boolean isSuccess=false;
		File file=new File(path);
		
		File parent=file.getParentFile();
		if(!parent.exists()) {
			isSuccess=parent.mkdirs();
		}
		if(!file.exists()) {
			try {
				isSuccess=file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(!isSuccess) {
			System.out.println(file.getName()+"is existed");
		}
		return file;
	}
}
