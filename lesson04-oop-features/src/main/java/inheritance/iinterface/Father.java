package inheritance.iinterface;

public interface Father {
	//ko co phan than:goi la phuong thuc truu tuong(abstract method)
	default void working() {
		System.out.println("LAZY !!!");
	}
	void playGame();
	void drinkBeer();
	
}
