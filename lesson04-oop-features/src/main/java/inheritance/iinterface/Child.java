package inheritance.iinterface;

public class Child extends Ancester implements Father, Mother{

	public void playGame() {
		System.out.println(getClass().getSimpleName() + " playGame");
		
	}

	public void drinkBeer() {
		System.out.println(getClass().getSimpleName() + " drinkBeer");
		
	}

	public void cooking() {
		
	}

	public void makeup() {
		
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		Mother.super.working();
	}

	@Override
	void getAdn() {
		// TODO Auto-generated method stub
		
	}

	

}
