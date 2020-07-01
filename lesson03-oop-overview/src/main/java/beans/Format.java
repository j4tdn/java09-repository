package beans;

public class Format {
	private static Format format = null;
	
	
	public static Format getInstance() {
		if(format ==null) {
			format = new Format();
		}
		return format;
	}
	private Format() {
		
	}
}
