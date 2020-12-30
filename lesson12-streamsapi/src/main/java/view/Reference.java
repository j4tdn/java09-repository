package view;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		// no-args
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgns = noArgsSup.get();

		// java8: type reference
		Function<String, Apple> oneArgFunc = Apple::new;
		Apple oneArg = oneArgFunc.apply("G02");
		System.out.println("id: " + oneArg.getId());
	}
}
