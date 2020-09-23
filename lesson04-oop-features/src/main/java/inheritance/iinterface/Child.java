package inheritance.iinterface;

public class Child extends Ancester implements Father,Mother {
	public void drinkBeer() {
		System.out.println(getClass().getSimpleName() + " playGame");
	}
	public void playGame() {
		System.out.println(getClass().getSimpleName() + " drinkBeer");
	}
	
	public void cooking() {
		// TODO Auto-generated method stub
		
	}
	public void makeup() {
		// TODO Auto-generated method stub
		
	}
	
	public void working() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void getAdn() {
		// TODO Auto-generated method stub
		
	}
}

