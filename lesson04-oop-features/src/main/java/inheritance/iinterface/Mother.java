package inheritance.iinterface;

public interface Mother {
	default void working() {
		System.out.println("working hard");
		
	}
	void cooking();
	void makeup();


}
