package polymorphism;

public class OverideDemo {
	public static void main(String[] args) {
		Parent father=new Parent();
		father.playSport();
		
		System.out.println("==================================");
		
		Child son=new Child();
		son.playSport();
		
		System.out.println("==================================");
		
		Parent underfined =new Child();
		System.out.println("runtime instance: "+ underfined.getClass());
		underfined.playSport();
	}
}
