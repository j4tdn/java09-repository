package inheritance.iinterface;

public class Child extends Ancester implements Father,Mother  {

	@Override
	public void playGame() {
		System.out.println(getClass().getSimpleName()+"play game");
	}

	@Override
	public void drinkBeer() {
		System.out.println(getClass().getSimpleName()+"drink beer");
		
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
		Father.super.working();
	}

	@Override
	void getADN() {
		// TODO Auto-generated method stub
		
	}
	
}
