package inheritance.iinterface;

public class Child extends Ancester implements Father,Mother{// vi ke thua tu 1 interface nen phai dung implement

	@Override
	public void playGame() {
		System.out.println(getClass().getSimpleName() + " play game");
	}

	@Override
	public void drinkBeer() {
		System.out.println(getClass().getSimpleName() + " drink beer");		
	}

	@Override
	public void cooking() {
		
	}

	@Override
	public void makeup() {
		
	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		Father.super.working();
	}

	@Override
	void geAdn() {
		// TODO Auto-generated method stub
		
	}



}
