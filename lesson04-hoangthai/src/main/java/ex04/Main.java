package ex04;

public class Main {
	public static void main(String[] args) {
		People manager=new Manager();
		People leader=new Leader();
		People staff=new Staff();
		manager.nhap();
		leader.nhap();
		staff.nhap();
		manager.Salary();
		leader.Salary();
		staff.Salary();
		System.out.println(manager);
		System.out.println(leader);
		System.out.println(staff);
	}
}
