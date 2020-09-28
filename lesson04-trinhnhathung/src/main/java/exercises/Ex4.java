package exercises;

import entities.Director;
import entities.Employee;
import entities.Manager;

public class Ex4 {
	public static void main(String[] args) {
		Director director = new Director("Trinh Nhat Hung",2000, 1.5f, 1f);
		Manager manager = new Manager("Nguyen Van Tien", 2000, 1.3f, 2);
		Employee employee1 = new Employee("Le Cao Viet Huy", 2000, 1.1f, "IT");
		Employee employee2 = new Employee("Nguyen Ngoc Lan", 2000, 1.1f, "IT");
		
		System.out.println("DIRECTOR:\n" + director);
		System.out.println("MANAGER:\n" + manager);
		System.out.println("EMPLOYEE 1:\n" + employee1);
		System.out.println("EMPLOYEE 2:\n" + employee2);
	}
}
