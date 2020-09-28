package entities;

public class Manager extends People{
	 private int numberOfManagementStaff;

	public Manager() {
		super();
	}
	 
	public Manager(String name,int birthDay,float coefficientsSalary,int numberOfManagementStaff) {
		super(name,birthDay,coefficientsSalary);
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	@Override
	public float getSalary() {
		return this.coefficientsSalary * 2200000;
	}

	@Override
	public String toString() {
		return super.toString() + ", numberOfManagementStaff:" + numberOfManagementStaff;
	} 
	
	
}
