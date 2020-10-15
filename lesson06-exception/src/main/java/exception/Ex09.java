package exception;

public class Ex09 {
	public static void main(String[] args) {
		try {
			recruitHR(true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		//	System.out.println(e.getMessage());
		}

	}

//require:female
	private static boolean recruitHR(boolean gender) throws invalidGenderException {
		if (gender) {
			throw new invalidGenderException("Gender require : female ");

		}
		return true;
	}
}
