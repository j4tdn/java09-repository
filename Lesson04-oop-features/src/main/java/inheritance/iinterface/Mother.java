package inheritance.iinterface;

public interface Mother {
	default void working() {
		System.out.println("hard !!");
	};
	void cooking();
	
	void makeup();
}
