package utils;

public class SqlUtils {
	private SqlUtils() {
		
	}
	@SuppressWarnings("unchecked")
	public static <C extends AutoCloseable> void close(C ...cs) {
		for(C c: cs) {
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

