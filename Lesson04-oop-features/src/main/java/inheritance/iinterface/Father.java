
package inheritance.iinterface;

public interface Father {
	//no body: abstract method
	void playgame();
	void drinkBeer();
	default void working() {
		System.out.println(" hard");
	}
}
