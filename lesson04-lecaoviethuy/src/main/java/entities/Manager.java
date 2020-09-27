package entities;

public class Manager extends Staff{
	private int numberOfManagementStaff;

	public Manager() {
		super();
	}

	public Manager(String name, String birthDay, float coefficientSalary, int numberOfManagementStaff) {
		super(name, birthDay, coefficientSalary);
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	@Override
	float getSalary() {
		return (this.salaryCoefficient) * 2200000;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", number of management staff: " + this.numberOfManagementStaff;
	}
}
