package ex04;

public class Employee extends People {
	private String nameOfDepartment;

	public Employee() {
	}

	public Employee(String nameOfDepartment) {
		super();
		this.nameOfDepartment = nameOfDepartment;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Nhập tên đơn vị: ");
		this.nameOfDepartment = sc.nextLine();
	}

	@Override
	public Float getSalary() {
		return (this.coefficientsSalary) * 1250000;
	}

	@Override
	public String toString() {
		return super.toString() + ", nameOfDepartment=" + nameOfDepartment + ", Salary: " + getSalary();
	}

}
