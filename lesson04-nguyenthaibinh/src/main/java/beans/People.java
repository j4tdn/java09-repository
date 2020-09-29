package beans;

public class People {
	private String firstNameAndLastname;
	private int yearOfBird;
	private float coefficientSalary;
	
	public People(String firstNameAndLastname, int yearOfBird, float coefficientSalary) {
		this.firstNameAndLastname = firstNameAndLastname;
		this.yearOfBird = yearOfBird;
		this.coefficientSalary = coefficientSalary;
	}

	public String getFirstNameAndLastname() {
		return firstNameAndLastname;
	}

	public void setFirstNameAndLastname(String firstNameAndLastname) {
		this.firstNameAndLastname = firstNameAndLastname;
	}

	public int getYearOfBird() {
		return yearOfBird;
	}

	public void setYearOfBird(int yearOfBird) {
		this.yearOfBird = yearOfBird;
	}

	public float getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(float coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}
}
