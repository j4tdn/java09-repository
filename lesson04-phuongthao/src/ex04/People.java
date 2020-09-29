package ex04;

public abstract class People {
	String name;
	int yearOfBirth;
	float salary;

	public People() {
	}

	public People(String name, int yearOfBirth, float salary) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public float getSalairy() {
		return salary;
	}

	public void setSalairy(float salairy) {
		this.salary = salairy;
	}
	
	public abstract float sumSalary() ;

}
