package inheritance.iinterface;

public interface Father {
	//no body:abstract method
	void playGame();
	
	void drinkBeer();
	
	default void working() {
		System.out.println("Lazy");
		
	}
	
}
