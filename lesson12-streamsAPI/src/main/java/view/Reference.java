package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
public static void main(String[] args) {
//	Supplier<Apple> noArgs=() ->new Apple();
	Supplier<Apple> noArgsSUP=Apple::new;
	Apple	noArgs=noArgsSUP.get();
	System.out.println("id:"  +noArgs.getId());
	
	Function<String, Apple> oneArgFunc=Apple::new;
	Apple onearg=oneArgFunc.apply("G02");
	System.out.println("id:"  +noArgs.getId());

	
}
}
