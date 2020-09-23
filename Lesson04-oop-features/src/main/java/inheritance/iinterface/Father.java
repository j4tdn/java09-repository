package inheritance.iinterface;

public interface Father {
	default void working() {
		System.out.println("lazy !!");
	};
	void playGame();
	
	void drinkBeer();
}
