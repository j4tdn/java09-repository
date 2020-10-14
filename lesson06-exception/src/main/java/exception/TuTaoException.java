package exception;

public class TuTaoException {
	public static void main(String[] args) {
		try {
			recruitHR(true);
		} catch (InvalidGenderException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	private static boolean recruitHR(boolean gender) throws InvalidGenderException {
		if (gender) {
			 throw new InvalidGenderException("Gender required : FEMALE");
		}
		return true;
	}
}
