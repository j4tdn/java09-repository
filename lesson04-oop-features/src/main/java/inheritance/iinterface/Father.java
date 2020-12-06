package inheritance.iinterface;

public interface Father {
	
	default void working() {
		System.out.println("LAZY !!!");
	}
	
	static void log() {
		
	}
	
	private void logString() {
		
	}
	
	// no body: abstract method
	// mặc định: public
	void playGame();
	void drinkBeer();
}
