package entities;

public class Employee extends People {
	private String departmentName;
	
	public Employee (String name,int birthDay,float coefficientsSalary,String departmentName) {
  	  super(name,birthDay,coefficientsSalary);
  	  this.departmentName = departmentName;
   }

	public Employee() {
		super();
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public float getSalary() {
		return this.coefficientsSalary * 1250000;
	}

	@Override
	public String toString() {
		return super.toString() + ", departmentName:" + departmentName;
	}

	
}
