package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;
import java.util.stream.Stream;

import bean.Student;

public class FileUtils {
	private FileUtils() {
		
	}
	public static File[] createFile(String ...paths) {
		return Arrays.stream(paths)
				.map(path -> createFile(path))
				.toArray(File[]::new);
	}
	public static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		
		File parent = file.getParentFile();
		if(!parent.exists()) {
			isSuccess = parent.mkdirs();
			if(isSuccess) {
				if(!file.exists()) {
					try {
						isSuccess = file.createNewFile();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		if(!isSuccess) {
			System.out.println(file.getName() + " is existed");
		}
		return file;
	}
	
	public static boolean writeLine(File file, String... lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
		return true;
	}
	
	public static <E extends AutoCloseable>void close(E... element) {
		for(E e: element) {
			try {
				e.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	public static void writeObject(File file, Object object) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(oos);
		}
	}
	public static Optional<Object> readObject(File file) {
		Object object = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(ois);
		}
		return Optional.ofNullable(object);
	}
	public static void open(File file) {
		
	}
	public static Properties getProperties(File file) {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}
	public static void writeJson(File file, Student student) {
		
	}
}
