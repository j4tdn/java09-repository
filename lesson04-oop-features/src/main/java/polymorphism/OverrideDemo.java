package polymorphism;

public class OverrideDemo {
	public static void main(String[] args) {
		Parent father = new Parent();
		father.drinkBeer();
		System.out.println("----------------------------");
		Child son = new Child();
		son.drinkBeer();

		System.out.println("----------------------------");
		Parent undefine = new Child();
		System.out.println("runtime instance: " + undefine.getClass());
		undefine.drinkBeer();
	}
}
