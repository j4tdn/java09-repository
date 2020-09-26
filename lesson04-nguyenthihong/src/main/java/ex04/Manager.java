package ex04;

public class Manager extends People {
	private Integer numberOfEmployee;

	public Manager() {
	}

	public Manager(Integer numberOfEmployee) {
		super();
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Nhập số lượng nhân viên: ");
		this.numberOfEmployee = Integer.parseInt(sc.nextLine());
	}

	@Override
	public Float getSalary() {
		return (this.coefficientsSalary) * 2200000;
	}

	@Override
	public String toString() {
		return super.toString() + ", numberOfEmployee=" + numberOfEmployee + ", Salary: "+ getSalary();
	}

}
