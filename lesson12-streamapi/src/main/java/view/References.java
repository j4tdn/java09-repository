package view;

import java.lang.annotation.Annotation;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class References {
	
	public static void main(String[] args) {
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs = noArgsSup.get();
		
		Function<String, Apple> oneArgFunc= Apple::new;
		Apple oneArg = oneArgFunc .apply("G02");
		
		
	}

}
