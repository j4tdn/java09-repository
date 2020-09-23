package inheritance.iinterface;

public interface Mother {
	default void working() {
		System.out.println("Hard");
	}
	void cooking();
	void makeup();
}
