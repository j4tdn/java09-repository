package beans;

public class Manager extends People{
	private float coefficientPosition;

	public Manager(String firstNameAndLastname, int yearOfBird, float coefficientSalary) {
		super(firstNameAndLastname, yearOfBird, coefficientSalary);
		// TODO Auto-generated constructor stub
	}

	public float getCoefficientPosition() {
		return coefficientPosition;
	}

	public void setCoefficientPosition(float coefficientPosition) {
		this.coefficientPosition = coefficientPosition;
	}
	
	
}
