package exception;

public class Ex09 {
	public static void main(String[] args) {
		try {
			recruitHR(true);
		} catch (InvalidGenderException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	private static boolean recruitHR(boolean gender) throws InvalidGenderException {
		if(gender) {
			throw new InvalidGenderException("Gender required: FEMALE");
		}
		return true;
		
	}
}
