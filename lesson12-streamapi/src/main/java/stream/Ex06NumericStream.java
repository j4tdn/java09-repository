package stream;

import java.util.List;
import java.util.OptionalDouble;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex06NumericStream {
	private static AppleService sevice;
	static {
		sevice = new AppleServiceImpl();
	}
	public static void main(String[] args) {
		//Apple. Find apple with highest weight
		List<Apple> inventory = sevice.getAll();
		OptionalDouble optional = inventory.stream().mapToDouble(Apple :: getWeight).max();
		System.out.println(optional.orElse(Double.MIN_VALUE));
	}
}
