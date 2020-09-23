package inheritance.iinterface;

public interface Mother {
	void cooking();
	void makeup();
	default void working() {
		System.out.println("Hard");
		
	}
}
