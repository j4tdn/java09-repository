package ex04;

public class NhanVien extends People {
	private String department;

	public NhanVien() {
		super();
	}

	public NhanVien(String name, String dayOfBirth, float coefficientSalary, String department) {
		super(name, dayOfBirth, coefficientSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	float calSalary() {
		return this.salaryCoefficient * 3000000;
	}

	@Override
	public String toString() {
		return super.toString()
				+ ",	department:	" + department;
	}
}
