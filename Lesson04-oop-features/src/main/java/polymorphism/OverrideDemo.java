package polymorphism;

public class OverrideDemo {
	public static void main(String[] args) {
		Parent father = new Parent();
		father.playSprot();
		System.out.println("====================");
		Child son = new Child();
		son.playSprot();
		System.out.println("====================");
		Parent underfied = new Child();
		System.out.println("runtime instance: "+underfied.getClass());
		underfied.playSprot();
	}
}
