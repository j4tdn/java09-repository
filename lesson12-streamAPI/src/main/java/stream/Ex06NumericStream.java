package stream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.List;
import java.util.List.*;

import bean.Apple;
import service.AppleService;
import service.AppleServiceimpl;

public class Ex06NumericStream {
	
	private static AppleService service;
	static {
	       service=new AppleServiceimpl();
	}
	
	public static void main(String[] args) {
		//Apple. Find apple witList<A>ghest weight
		List<Apple> inventory = service.getAll();
		OptionalDouble optional=inventory.stream()
				 .mapToDouble(Apple::getWeight)
				 .max();
		
		System.out.println(optional.orElse(Double.MIN_VALUE));
	}
}
