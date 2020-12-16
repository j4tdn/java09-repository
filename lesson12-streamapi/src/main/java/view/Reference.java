package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		// no-argument
		Supplier<Apple> noArgument = Apple::new;
		Apple noAgrs = noArgument.get();

		Function<String, Apple> oneArgs = new Function<String, Apple>() {

			@Override
			public Apple apply(String id) {
				return new Apple(id);
			}

		};

		Apple oneAgrs = oneArgs.apply("ID01");
	}
}
