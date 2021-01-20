package utils;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class FileUtils {

	private FileUtils() {

	}

	public static File[] createFile(String... paths) {
		return Arrays.stream(paths).map(path -> createFile(path)).toArray(File[]::new);
	}

	public static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);

		File parent = file.getParentFile();
		if (!parent.exists()) {
			parent.mkdirs();
		}
		if (!file.exists()) {
			try {
				isSuccess = file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (!isSuccess) {
			System.out.println(file.getName() + " is existed");
		}
		return file;
	}

	// writefile
	public static void writeLine(File file, String... lines) {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file,true);
			bw = new BufferedWriter(fw);
			for(String line: lines) {
			bw.write(line);
			bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}

	}
	public static void writeObject(File file, Object obj) {
		FileOutputStream  fos =null;
		ObjectOutputStream oos=null;
		
		try {
			fos = new FileOutputStream(file);
			oos =new ObjectOutputStream(fos);
			oos.writeObject(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(oos, fos);
		}
	}
	public static void open(File file) {
		Objects.requireNonNull(file,"file canbot be null");
		try {
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static <T extends AutoCloseable> void close(T... elements) {
		for (T e : elements) {
			try {
				e.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static Optional<Object> readObject(File file) {
		Object object =null;
		FileInputStream  fis =null;
		ObjectInputStream ois=null;
		
		try {
			fis = new FileInputStream(file);
			ois =new ObjectInputStream(fis);
			object=	ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(ois, fis);
		}
		return Optional.ofNullable(object);
	}

}
