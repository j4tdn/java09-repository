package ex04;

public abstract class People {
	protected String name;
	protected String dayOfBirth;
	protected float salaryCoefficient;
	
	abstract float calSalary();

	public People() {
	}

	public People(String name, String dayOfBirth, float coefficientSalary) {
		super();
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.salaryCoefficient = coefficientSalary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDay() {
		return dayOfBirth;
	}
	public void setBirthDay(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	public float getCoefficientSalary() {
		return salaryCoefficient;
	}
	public void setCoefficientSalary(int coefficientSalary) {
		this.salaryCoefficient = coefficientSalary;
	}
	

	
	@Override
	public String toString() {
		return "name:	" + this.name
				+ ",	day of birth:	" + this.dayOfBirth
				+ ",	salary coefficient:	" + this.salaryCoefficient;
	}
}
