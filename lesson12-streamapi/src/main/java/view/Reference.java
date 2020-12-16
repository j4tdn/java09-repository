package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		// no argument
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs = noArgsSup.get();
		
		// type reference
		Function<String, Apple> oneArgFunc = Apple::new;
		
		Apple oneArg = oneArgFunc.apply("G02");
	}
}
