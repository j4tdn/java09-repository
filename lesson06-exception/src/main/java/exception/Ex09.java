package exception;

public class Ex09 {
	public static void main(String[] args) {
		try {
			recruitHR(true);
		} catch (InvalidGenderException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	private static boolean recruitHR(boolean gender) throws InvalidGenderException {
		if(gender) {
			throw new InvalidGenderException("gender required:femal");
		}
		return true;
	}
}
