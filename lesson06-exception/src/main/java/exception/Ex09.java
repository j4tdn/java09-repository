package exception;

public class Ex09 {
	public static void main(String[] args) {
	
		try {
			RecruitHR(true);
		} catch (InvalidGenderException e) {
			//e.printStackTrace();
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	// recruit : female
	private static boolean RecruitHR(boolean gender) throws InvalidGenderException{
		if(gender)
		{
			throw new InvalidGenderException("Gender required : FEMALE");
			}
		return true;
		}
}
