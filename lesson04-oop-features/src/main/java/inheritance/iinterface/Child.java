package inheritance.iinterface;

public class Child	extends Ancester implements Father,Mother{

	@Override
	public void playGamme() {
		System.out.println(getClass().getSimpleName() + " playgame");
	}

	@Override
	public void drinkBeer() {
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
		Mother.super.working();
	}

	@Override
	void getAdn() {
		// TODO Auto-generated method stub
		
	}

}
