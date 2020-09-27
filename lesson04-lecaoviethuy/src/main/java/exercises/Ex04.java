package exercises;

import entities.Director;
import entities.Employee;
import entities.Manager;

public class Ex04 {
	public static void main(String[] args) {
		Director director = new Director("Le Van A", "21/08/2000", 1.4f, 0.8f);
		Manager manager = new Manager("Nguyen Van B", "08/05/1999", 1.2f, 20);
		Employee emp1 = new Employee("Huynh Thi P", "29/02/2000", 1.1f, "Hanh chinh");
		Employee emp2 = new Employee("Tran Van Cuong", "07/11/2002", 1.0f, "Marketing");
		
		System.out.println("DIRECTOR:\n" + director);
		System.out.println("MANAGER:\n" + manager);
		System.out.println("EMPLOYEE 1:\n" + emp1);
		System.out.println("EMPLOYEE 2:\n" + emp2);
	}
}
