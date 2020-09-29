package ex04;

public class President extends People{
	int position;
	
	public President() {
	}

	public President(String name, int yearOfBirth, float salary, int position) {
		super(name, yearOfBirth, salary);
		this.position= position;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public float sumSalary() {
		return (salary + position)*300000;
	}

	@Override
	public String toString() {
		return "Salary's President = "+ name +"	"+ sumSalary(); 
	}
	
	
	
	
	
	

}
