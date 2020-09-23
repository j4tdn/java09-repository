package polymorphism.method;

public class OverrideDemo {
	public static void main(String[] args) {
		Parent father = new Parent();
		father.playSport();
		
		System.out.println("======================");
		
		Child child = new Child();
		child.playSport();
		
		System.out.println("======================");
		
		Parent undefined = new Child();
		System.out.println("runtime instance: " + undefined.getClass());
		undefined.playSport();
	}
}
