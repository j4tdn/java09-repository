package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Refrence {
	public static void main(String[] args) {
		//no-argument
		Supplier<Apple> noArgsSup = Apple::new;//tra ve 1 cai functional interface
		Apple noArgs = noArgsSup.get();
//		Function<String, Apple> oneArgFunc = id -> new Apple(id);
		Function<String, Apple> oneArgFunc = Apple::new;
		Apple oneArg = oneArgFunc.apply("G02");
		System.out.println(oneArg.getId());
	}
}
