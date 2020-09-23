package inheritance.iinterface;

public class Child implements Father, Mother {// vì kế thừa từ 1 interface nên dùng implements

	public void playGame() {
		System.out.println(getClass().getSimpleName() + " playGame");
	}

	public void drinkBeer() {
		System.out.println(getClass().getSimpleName() + " drinkBeer");
	}

	public void cooking() {

	}

	public void makeup() {

	}

	@Override
	public void working() {
		// TODO Auto-generated method stub
		Father.super.working();
	}



}
