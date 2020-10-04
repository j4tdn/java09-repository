package encapsulation;

public class ClassTest {
	private String name;
	private int phone;
	
	public ClassTest() {
		
	}
	
	public ClassTest(String name,int phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public static void printSomething() {
		System.out.println("Something!");
	}
	
}
