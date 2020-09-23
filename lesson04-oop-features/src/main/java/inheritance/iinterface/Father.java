package inheritance.iinterface;

public interface Father {
	// no body: abstract method
	default void working() {
		System.out.println("Hard  !!!");
	}

	void playGame();

	void drinkBeer();
}
