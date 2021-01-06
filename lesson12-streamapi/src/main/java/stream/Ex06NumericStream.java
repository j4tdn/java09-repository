package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex06NumericStream {
	private static AppleService service;

	static {
		service = new AppleServiceImpl();
	}

	public static void main(String[] args) {
		// Apple. find apple with highest weight
		List<Apple> inventory = service.getAll();
		OptionalDouble optional = inventory.stream().mapToDouble(Apple::getWeight).max();
		System.out.println(optional.orElse(Double.MIN_VALUE));
		
		//sum of List<Integer>
		List<Integer> digits = Arrays.asList(1, 3, 5, 6);
		int sum = digits.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("sum: " + sum);
	}
}
