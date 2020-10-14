package exception;

public class Ex09 {
	public static void main(String[] args) {
		try {
			recruitHR(true);
		} catch (InvalidGenderException e) {
			
			e.printStackTrace();
		//	System.out.println(e.getMessage());	
		}
		
		
	}
	
	//requite: female
	private static boolean recruitHR(boolean gender ) throws InvalidGenderException {	//loi combine co ra 1 exception	
		if(gender) {
			throw new InvalidGenderException("Gender requred female!");		//checked exception		 bi bat loi nen throws 
		}
		return true;
	}

}
