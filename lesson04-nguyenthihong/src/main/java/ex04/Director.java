package ex04;

public class Director extends People {
	private Float coefficientPosition;

	public Director() {
	}

	public Director(Float coefficientPosition) {
		super();
		this.coefficientPosition = coefficientPosition;
	}

	@Override
	public void input() {
		super.input();
		System.out.println("Nhập hệ số chức vụ: ");
		this.coefficientPosition = Float.parseFloat(sc.nextLine());
	}

	@Override
	public Float getSalary() {
		return (this.coefficientPosition + this.coefficientsSalary) * 3000000;
	}

	@Override
	public String toString() {
		return super.toString() + ", coefficientPosition=" + coefficientPosition + ", Salary: " + getSalary();
	}

}
