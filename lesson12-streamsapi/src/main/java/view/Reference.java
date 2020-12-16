package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		Supplier<Apple> noArgs = Apple::new;
		
		Function<String, Apple> oneArgs = Apple::new;
		Apple x = oneArgs.apply("");
	}
}
