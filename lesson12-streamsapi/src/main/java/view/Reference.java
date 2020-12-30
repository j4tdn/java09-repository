package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		
		//no-args
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs = noArgsSup.get();
		
		//type reference
		Function<String, Apple> oneArgFunc = new Function<String, Apple>() {

			@Override
			public Apple apply(String id) {
				return new Apple(id);
			}
		};
		Apple oneArg = oneArgFunc.apply("G02");
		System.out.println("id: " + oneArg.getId());
	}
}
