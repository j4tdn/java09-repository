package inheritance.iinterface;

public interface Father {
	default void working() {
		System.out.println("work lazy!!");
	}
	void playGame();
	void drinkBeer();
}

