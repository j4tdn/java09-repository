package beans;

public class Format {
	private static Format format = null;
	private Format() {
		
	}
	public static Format getInstance() {
		if(format == null) {
				format = new Format();
			}
			
			return format ;
			
		}
	
	
	

}
