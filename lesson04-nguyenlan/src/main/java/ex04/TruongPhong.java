package ex04;

public class TruongPhong extends People {
	private int numberOfManagementStaff;
	
	public TruongPhong() {
		super();
	}
	
	public TruongPhong(String name, String dayOfBirth, float coefficientSalary, int numberOfManagementStaff) {
		super(name, dayOfBirth, coefficientSalary);
		this.numberOfManagementStaff = numberOfManagementStaff;
	}
	
	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	
	@Override
	public String toString() {
		return super.toString()
				+ ",number of management staff:	s" + this.numberOfManagementStaff;
	}


	@Override
	float calSalary() {
		return (this.salaryCoefficient) * 2200000;
	}
}
	
