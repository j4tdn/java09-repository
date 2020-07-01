package polymorphism;

public class OverrideDemo {
	public static void main(String[] args) {
		 Parent father = new Parent();
		 father.playSport();
		 System.out.println("========================");
		 Parent  son = new Child();
		 son.playSport();
	}
}
