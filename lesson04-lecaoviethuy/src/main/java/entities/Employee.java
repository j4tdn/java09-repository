package entities;

public class Employee extends Staff{
	private String department;

	public Employee() {
		super();
	}

	public Employee(String name, String birthDay, float coefficientSalary, String department) {
		super(name, birthDay, coefficientSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	float getSalary() {
		return this.salaryCoefficient * 3000000;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ ", department: " + department;
	}
}
