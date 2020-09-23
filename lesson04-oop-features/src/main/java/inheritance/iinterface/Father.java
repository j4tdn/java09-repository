package inheritance.iinterface;

public interface Father {
	
	default void working() {
		System.out.println("Lazy");
	}
	//no body: abstract method
	
	void playGamme();
	void drinkBeer();
	
	
	
}
