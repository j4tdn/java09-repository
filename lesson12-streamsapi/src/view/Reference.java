package view;

import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		// no-args
		Supplier<Apple> noArgsSup = () -> new Apple();
		Apple noArgs = noArgsSup.get();
	}
}
