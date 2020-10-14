package exception;

public class Ex09 {
	public static void main(String[] args) {
		try {
			reruitHR(true);
		} catch (IvalidGenderException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	private static boolean reruitHR(boolean gender ) throws IvalidGenderException {
		if(gender) {
			throw new IvalidGenderException("Gender required: Female");
		}
		return true;
	}
}
