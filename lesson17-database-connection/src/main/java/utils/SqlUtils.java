package utils;

public class SqlUtils {
	public SqlUtils() {
		
	}
	@SuppressWarnings("unchecked")
	public static void close(AutoCloseable ...cs) {
		for (AutoCloseable c: cs) {
			if(c != null) {
				try {
					c.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}