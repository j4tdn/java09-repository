package inheritance.iinterface;

public interface Father {

	// no body: abstract method

	default void working() {
		System.out.println("LAZY !!!");
	}

	void playGame();

	void drinkBeer();
}
