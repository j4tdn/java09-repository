package inheritance.iinterface;

public class Child extends Ancester implements Father, Mother {

	@Override
	public void playGame() {
		System.out.println(getClass().getSimpleName() + " play game");
	}

	@Override
	public void drinkBeer() {
		System.out.println(getClass().getSimpleName() + " drink beer ");

	}

	@Override
	public void cook() {

	}

	@Override
	public void makeup() {

	}

	@Override
	public void working() {
		Father.super.working();
	}

	@Override
	void getADN() {
		
	}

}
