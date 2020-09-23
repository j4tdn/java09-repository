package inheritance.iinterface;

public class Child extends Ancester implements Father,Mother{

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "playGame");
	}

	@Override
	public void drinkBeer() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " drinkBeer");
	}

	@Override
	public void cooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void makeup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getAdn() {
		// TODO Auto-generated method stub
		
	}

}
