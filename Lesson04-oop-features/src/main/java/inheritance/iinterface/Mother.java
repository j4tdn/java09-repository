package inheritance.iinterface;

public interface Mother {
	default void working() {
		System.out.println("lazy");
	}

	void cooking();

	void makeup();

}
