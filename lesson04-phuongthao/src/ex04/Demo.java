// cai cho dinh dang so em quen mat anh
package ex04;

public class Demo {
	public static void main(String[] args) {
		
		
		President president = new President("Nguyen Van A", 1985, 2000, 1);
		Manager manager = new Manager("Nguyen van B ", 1990, 2000, 50);
		Staff staff = new Staff("Nguyen Van C", 1995, 1000, "maketting");
		
		System.out.println(president);
		System.out.println(manager);
		System.out.println(staff);
	}

}
