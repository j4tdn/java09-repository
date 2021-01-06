package stream;

import java.util.List;
import java.util.OptionalDouble;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex06NumericStream {
	private static AppleService service = new AppleServiceImpl();

	public static void main(String[] args) {
		List<Apple> inventory = service.getAll();
		
		// Find apple with highest weight
		OptionalDouble maxOpt = inventory.stream().mapToDouble(Apple::getWeight).max();

		System.out.println(maxOpt.orElse(0));
	}
}
