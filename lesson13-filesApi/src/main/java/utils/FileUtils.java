package utils;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
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

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import bean.Student;

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
				e.printStackTrace();
			}
		}
		if (!isSuccess) {
			System.out.println(file.getName() + "is existed.");
		}
		return file;
	}

	public static void writeLine(File file, String... Lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			for (String line : Lines) {
				fw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
	}

	public static void writeObject(File file, Object objcect) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(objcect);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(oos, fos);
		}
	}
	public static void writeJson(File file ,Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String readJsonAsString(Object object) {
		String result= StringUtils.EMPTY;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(object);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public static Optional<Object> readObject(File file){
		Object object = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
		}  catch (Exception e) { 
		} finally {
			close(ois, fis);
		}
		return Optional.ofNullable(object);
		}
	public static Properties getProperties(File file) {
		Properties props = new Properties();
		
		try {
			props.load(new FileInputStream(file));
			
		} catch (Exception e) {
			e.printStackTrace();
	
	}
		return props;
	}
	public static void open(File file) {
		Objects.requireNonNull(file, "file cannot be null.");
		try {
			Desktop.getDesktop().open(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static <E extends AutoCloseable> void close(E... elements) {
		for (E e : elements) {
			try {
				e.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
