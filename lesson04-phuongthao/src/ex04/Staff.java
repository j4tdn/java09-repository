package ex04;

public class Staff extends People {

	String department;

	public Staff() {

	}

	public Staff(String name, int yearOfBirth, float salary, String departement) {
		super(name, yearOfBirth, salary);
		this.department=departement;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public float sumSalary() {
		return (salary)*1250000;
	}

	@Override
	public String toString() {
		return "Salary's Staff = "+ name + "	" + sumSalary(); 
	}
	

}
