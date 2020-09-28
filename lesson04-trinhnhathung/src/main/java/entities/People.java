package entities;

public abstract class People {
	protected String name;
	protected int birthDay;
	protected float coefficientsSalary;

	public People() {
		super();
	}

	public People(String name, int birthDay, float coefficientsSalary) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public abstract float getSalary ();

	@Override
	public String toString() {
		return "name:" + name + ", birthDay:" + birthDay + ", coefficientsSalary:" + coefficientsSalary;
	}
	
	
}
