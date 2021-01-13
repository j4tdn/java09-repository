package util;

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

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import bean.Student;

public class FileUtils {
	private FileUtils() {
	}
	
	public static File createFile(String path) {
		boolean isSuccess = true;
		
		File file = new File(path);
		File parent = file.getParentFile();
		if(!parent.exists()) {
			isSuccess = parent.mkdirs();
		}
		
		if(isSuccess) {
			if(!file.exists()) {
				try {
					isSuccess = file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return file;
	}
	
	public static File[] createFiles(String ...paths) {
		return Arrays.stream(paths)
				.map(FileUtils::createFile)
				.toArray(File[]::new);
	}
	
	public static void writeLine(File file, String... lines) {
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
			close(bw, fw);
		}
	}
	
	public static <E extends AutoCloseable> void close(E ...elements) {
		for(E e: elements) {
			try {
				e.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
	
	public static void writeObject(File file, Object obj) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			close(fos, oos);
		}
	}
	
	public static Optional<Object> readObject(File file) {
		Object obj = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			obj = ois.readObject();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			close(fis, ois);
		}
		
		return Optional.ofNullable(obj);
	}
	
	public static void open(File file) {
		Objects.requireNonNull(file);
		
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Properties getProperties(File file) {
		Properties props = new Properties();
		InputStream is;
		
		try {
			is = new FileInputStream(file);
			props.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return props;
	}
	
	public static void writeJson(File file, Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, object);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String writeAsStringJson(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static <T> T readJson(File file, Class<T> classType) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readValue(file, classType);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
