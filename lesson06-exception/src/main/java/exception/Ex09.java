package exception;

public class Ex09 {
	public static void main(String[] args) {
		try {
			recruitHR(true);
		} catch (InvalidGenderException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static boolean recruitHR(boolean gender) throws InvalidGenderException {
		if(gender) {
			throw new InvalidGenderException("Gender require: FEMALE");
		} else {
			return true;
		}
	}
}
