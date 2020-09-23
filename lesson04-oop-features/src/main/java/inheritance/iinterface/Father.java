package inheritance.iinterface;

public interface Father {
	// no body:abstract method: phương thức trừu tượng
	void playGame();

	void drinkBeer();

	default void working()
	{
		System.out.println("LAZY !!!");
	}
}
