package inheritance;

public class Cat extends Animal{
	int weight = 100;
	@Override
	void drink() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "=> drink");
	}
	

}
