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

import org.apache.commons.lang3.StringUtils;

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
			isSuccess = parent.mkdirs();
		}
		try {
			if (!file.exists()) {
				isSuccess = file.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (!isSuccess) {
			System.out.println(file.getName() + " is existed");
		}
		return file;
	}

	public static void writeObject(File file, Object... object) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(object);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(oos, fos);
		}
	}

	public static Optional<Object> readObject(File file) {
		Object object = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			object = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(ois, fis);
		}
		return Optional.ofNullable(object);
	}

	public static void writeLine(File file, String... lines) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(bw, fw);
		}
	}

	public static void writeJson(File file, Object object) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String writeAsString(Object object) {
		String result = StringUtils.EMPTY;
		ObjectMapper mapper = new ObjectMapper();
		try {
			result = mapper.writeValueAsString(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public static <T> Optional<T> readJson(File file,Class<T> classType) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			return Optional.ofNullable(mapper.readValue(file, classType));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Optional.empty();
	}

	public static Properties getProperties(File file) {
		Properties properties = new Properties();
		try {
			InputStream is = new FileInputStream(file);
			properties.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;
	}

	public static void open(File file) {
		try {
			Objects.requireNonNull(file, "file cannot be null");
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static <T extends AutoCloseable> void close(T... elements) {
		for (T element : elements) {
			try {
				element.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
