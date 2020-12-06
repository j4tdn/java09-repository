package funtionalinterface;

public class SumOperation implements Operation{

	@Override
	public int perform(int a, int b) {
		return a * b;
	}

}
