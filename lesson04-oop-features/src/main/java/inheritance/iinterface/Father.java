package inheritance.iinterface;

public interface Father {
	// no body: abstract method
	default void working() {
		System.out.println("lazy");

	}

	void playGame();

	void drinkBeer();

}
