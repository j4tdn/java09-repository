package beans;

public class Personnel extends People{
	private String unitName;

	public Personnel(String firstNameAndLastname, int yearOfBird, float coefficientSalary, String unitName) {
		super(firstNameAndLastname, yearOfBird, coefficientSalary);
		this.unitName = unitName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
}
