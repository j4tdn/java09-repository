package inheritance.iinterface;

public interface Mother {
	default void working() {
		System.out.println("Lazy !!!");
	}

	void cook();

	void makeup();
}
