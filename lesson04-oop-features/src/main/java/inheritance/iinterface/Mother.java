package inheritance.iinterface;

public interface Mother {
	default void working () {
		System.out.println("HARD !!!");
	}
	
	void playGame();

	void cooking();

	void makeup();
}
