package inheritance.iinterface;

public interface Father {
	void playGame();
	void drinkBeer();
	default void working () {
		System.out.println("LAZY !!!");
	}
}
