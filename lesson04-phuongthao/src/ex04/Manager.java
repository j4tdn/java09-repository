package ex04;

public class Manager extends People {

	int employeeManager;

	public Manager() {
	}

	public Manager(String name, int yearOfBirth, float salary, int employeeManager) {
		super(name, yearOfBirth, salary);
		this.employeeManager = employeeManager;
	}

	public int getEmployeeManager() {
		return employeeManager;
	}

	public void setEmployeeManager(int employeeManager) {
		this.employeeManager = employeeManager;
	}

	
	@Override
	public float sumSalary() {
		return (salary)*2200000;
	}

	@Override
	public String toString() {
		return "Salary's Manager  = "+ name + "	"+sumSalary(); 
	}
	

	
	

}
