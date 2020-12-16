package view;

import java.lang.annotation.Annotation;
import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
public static void main(String[] args) {
	Supplier<Apple> noArgsSup = Apple::new;
	Apple noArgs = noArgsSup.get();
	System.out.println("id: "+ noArgs.getId());
	
	
	
	Function<String, Apple> oneArg = Apple::new;		
	Apple onArg = oneArgFun.apply("G02");
	System.out.println("id: "+oneArg.getId());
}
}
