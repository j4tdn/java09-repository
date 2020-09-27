/**
 * 
 */
package maindemo;

import object.Employee;
import object.Manage;
import object.President;

public class ManageEmployee {
	public static void main(String[] args) {
		President president=new President();
		System.out.println("Enter information president:");
		president.input();
		Manage manage=new Manage();
		System.out.println("Enter information manage:");
		manage.input();
		System.out.println("Enter information employee 1:");
		Employee employee1=new Employee();
		employee1.input();
		System.out.println("Enter information employee 2:");
		Employee employee2=new Employee();
		employee2.input();
		System.out.printf("%-30s%-20s%-25s%-25s%-25s\n", "Name","YearOfBirth","CoefficientSalary","CoefficientPosition","Salary");
		System.out.println(president);
		System.out.printf("%-30s%-20s%-25s%-25s%-25s\n","Name","YearOfBirth","NumberOfEmployee","CoefficientSalary","Salary");
		System.out.println(manage);
		System.out.printf("%-30s%-20s%-25s%-25s%-25s\n","Name","YearOfBirth","Name unit","CoefficientSalary","Salary");
		System.out.println(employee1);
		System.out.printf("%-30s%-20s%-25s%-25s%-25s\n","Name","YearOfBirth","Name unit","CoefficientSalary","Salary");
		System.out.println(employee2);
	}
}
