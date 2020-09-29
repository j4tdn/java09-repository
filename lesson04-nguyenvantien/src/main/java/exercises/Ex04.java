package exercises;


import model.Director;
import model.Employee;
import model.Manager;

public class Ex04 {
	public static void main(String[] args) {
		
		Director d1 = new Director();
		Manager m1 = new Manager();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		d1.inputInf();
		m1.inputInf();
		e1.inputInf();
		e2.inputInf();
		
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(e1);
		System.out.println(e2);
		
	}
	
	
}
