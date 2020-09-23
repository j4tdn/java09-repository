package inheritance.iinterface;

public class Child implements Father{// vi ke thua tu 1 interface nen phai dung implement

	@Override
	public void playGame() {
		System.out.println(getClass().getSimpleName() + " play game");
	}

	@Override
	public void drinkBeer() {
		System.out.println(getClass().getSimpleName() + " drink beer");		
	} 

}
