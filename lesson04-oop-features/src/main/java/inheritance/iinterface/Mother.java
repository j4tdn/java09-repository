package inheritance.iinterface;

public interface Mother {
	default void working() {
		System.out.println("work hard!!");
	}
	void cooking();
	void makeup();
}
