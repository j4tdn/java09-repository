package ex04;

public class Main {
public static void main(String[] args) {
	People director = new Director();
	System.out.println("Thông tin giám đốc: ");
	director.input();
	System.out.println("--------------------");
	System.out.println("Thông tin trưởng phòng: ");
	People manager = new Manager();
	manager.input();
	System.out.println("--------------------");
	System.out.println("Thông tin nhân viên: ");
	People employee = new Employee();
	employee.input();

	System.out.println(director);
	System.out.println(manager);
	System.out.println(employee);
}
}
