package inheritance;

public class Cat extends Animal{
	int weight = 100;
	
//	public int getWeight() {
//		return weight;
//	}
	
	public void setWeight(int w) {
		weight = w;
	}
	
	@Override
	void drink() {
		// TODO Auto-generated method stub
		super.drink();
	}
	
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
}
