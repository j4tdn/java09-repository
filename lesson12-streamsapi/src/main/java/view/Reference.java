package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {

		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs = noArgsSup.get();
		Function<String, Apple> oneArgFUnc = Apple::new;
		Apple oneArg = oneArgFUnc.apply("G02");
		System.out.println("id: " + oneArg.getId());

	}
}