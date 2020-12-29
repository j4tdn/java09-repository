package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		// no-args
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs = noArgsSup.get();
		System.out.println("id: " + noArgs.getId());
		
		// type reference
		Function<Double, Apple> oneArgFunc = Apple::new;
		Apple oneArg = oneArgFunc.apply(20d);
		System.out.println("id: " + oneArg.getId());
	}
}
