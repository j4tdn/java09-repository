package inheritance.iinterface;

import inheritance.Ancester;

public  abstract class Child extends Ancester implements Father, Mother {

	@Override
	public void playGame() {
		System.out.println(getClass().getSimpleName() + " playGame");

	}

	@Override
	public void drinkBeer() {
		System.out.println(getClass().getSimpleName() + " drinkBeer");

	}

	@Override
	public void cooking() {

	}

	@Override
	public void makeup() {

	}

	@Override
	public void working() {
		Mother.super.working();

	}
	
	
	

}
