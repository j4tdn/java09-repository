package entities;

abstract class Staff {
	protected String name;
	protected String birthDay;
	protected float salaryCoefficient;
	
	abstract float getSalary();
	
	public Staff() {
	}
	
	public Staff(String name, String birthDay, float coefficientSalary) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.salaryCoefficient = coefficientSalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public float getCoefficientSalary() {
		return salaryCoefficient;
	}
	public void setCoefficientSalary(int coefficientSalary) {
		this.salaryCoefficient = coefficientSalary;
	}
	
	@Override
	public String toString() {
		return "name: " + this.name
				+ ", birth day: " + this.birthDay
				+ ", salary coefficient: " + this.salaryCoefficient;
	}
}
