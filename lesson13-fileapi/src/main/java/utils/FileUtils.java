package utils;

import java.awt.Desktop;
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

import org.apache.commons.lang3.StringUtils;
import org.xml.sax.InputSource;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import bean.Student;

public class FileUtils {

	public FileUtils() {
	}

	public static File createFile(String path) {
		boolean isSuccess = false;
		File file = new File(path);

		File parent = file.getParentFile();
		if (!parent.exists()) {
			isSuccess = parent.mkdirs();
		}

		if (!file.exists()) {
			try {
				file.createNewFile();
				isSuccess = true;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (!isSuccess) {
			System.out.println(file.getName() + " is existed.");
		}
		return file;
	}
	public static File[] createFile(String ...paths) {
		return Arrays.stream(paths)
				.map(path -> createFile(path))
				.toArray(File[]::new);
	}
	
	public static void writeLine(File file, String ...lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closed(bw, fw);
		}
	}
	
	public static <E extends AutoCloseable> void closed(E ...elements) {
		for(E e: elements) {
			try {
				e.close();
			} catch (Exception e1) {
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
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closed(oos,fos);
		}
	}
	
	public static Optional<Object> readObject(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object object = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			object = ois.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closed(ois,fis);
		}
		return Optional.ofNullable(object);
	}
	
	public static Properties getProperties(File file) {
		// extends Map
		Properties props = new Properties();
		try {
			props.load(new FileInputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}
	
	public static void writeJson(File file, Object object) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		try {
			mapper.writeValue(file, object);
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}
	}
	public static String writeJsonAsString(File file, Object object) {
		String result = StringUtils.EMPTY;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(object);
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
		return result;
	}
	public static <T> Optional<T> readJson(File file, Class<T> classType) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return Optional.ofNullable(mapper.readValue(file, classType)) ;
			
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		return Optional.empty();
	}
	public static void open(File file) {
		Objects.requireNonNull(file, "file cannot be null.");
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
