package exception;

public class Ex09 {
	public static void main(String[] args) {
		try {
			recruitHR(true);
		} catch (InvalidGenderException e) {
			e.printStackTrace();
		}
	}

	private static boolean recruitHR(boolean gender) throws InvalidGenderException {
		if (gender) {
			throw new InvalidGenderException("Gender required: Female");
		}
		
		return true;
	}
}
