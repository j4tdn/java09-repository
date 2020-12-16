package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		// no-args
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs = noArgsSup.get();
		
		Function<String, Apple> oneArgs = Apple::new;
		
		Apple oneArg = oneArgs.apply("G02");
		System.out.println("id: " + oneArg.getId());
		System.out.println("id : " + noArgs.getId());
	}
}
