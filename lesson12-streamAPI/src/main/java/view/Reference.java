package view;

import java.util.function.Function;
import java.util.function.Supplier;


import bean.Apple;

public class Reference {
	public static void main(String[] args) {
		// no auguments
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs = noArgsSup.get();
		System.out.println("id: " + noArgs.getId());
		//type reference 
		Function<String, Apple> oneArgsFunc = new Function<String, Apple>() {

			@Override
			public Apple apply(String id) {
				return new Apple(id);
			}
		};
		Apple oneArgs = oneArgsFunc.apply("G02");
		System.out.println("id: " + oneArgs.getId());
		
		
	}

}
