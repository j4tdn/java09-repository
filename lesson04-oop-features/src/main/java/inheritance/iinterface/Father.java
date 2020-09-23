package inheritance.iinterface;

public interface Father {
	
	default void working() {
		System.out.println("Lazy !!!");
	}
	void playGame();
	void drinkBeer();
	void getAdn();
}
