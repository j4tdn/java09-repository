package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		try {
			writeData(new File("readme.txt"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Done");
		
	}
	private static void writeData(File file) throws IOException  {
		FileWriter fw = null;
		try {
		
			 fw = new FileWriter(file);
			 fw.write("Cheeers from Java1");
			 fw.write("Cheeers from Java2");
			 
			 
			 fw.write("Cheeers from Javak" +1/0 );
			 
			
		} catch (Exception e) {
			e.printStackTrace();
				
		}finally { //finally: du xay ra exception van chay
			if(fw!=null) {
				fw.close();
			}
		}
		
		//NPE --close asa write file
		
	}

}
