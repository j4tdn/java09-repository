package beans;

public class Generalinchief extends People{
	private int numberOfManagementStaff;

	public Generalinchief(String firstNameAndLastname, int yearOfBird, float coefficientSalary,
			int numberOfManagementStaff) {
		super(firstNameAndLastname, yearOfBird, coefficientSalary);
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}
	
}
