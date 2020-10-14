package exception;

import java.io.File;
import java.io.FileWriter;

public class Ex10 {
	public static void main(String[] args) {
		File file = new File("readme.txt");
		try {
			writeData(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("DONE");
	}
	
	private static void writeData(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Ahihi 1\n");
			fw.write("Ahihi 2\n");
			fw.write("Ahihi 3\n");
			fw.write("Ahihi 4\n");
			fw.write("Ahihi k-1\n");
			fw.write("Ahihi k\n" + 1/0);
			fw.write("Ahihi k+1\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
