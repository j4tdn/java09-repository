package view;

import java.util.function.Function;
import java.util.function.Supplier;

import bean.Apple;

public class Reference {
	public static <T> void main(String[] args) {
		Supplier<Apple> noArgsSup = Apple::new;
		Apple noArgs=noArgsSup.get();	
		System.out.println("id: "+noArgs.getId());
		
		//type reference
		Function<String, Apple> oneArgFun =Apple::new;
		
			
		
		Apple oneArg = oneArgFun.apply("G02");
		System.out.println("id: "+ oneArg.getId());
			
		
	}
}
