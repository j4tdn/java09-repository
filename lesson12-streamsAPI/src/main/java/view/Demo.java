package view;

import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.ListUtils;

public class Demo {
	private static AppleService service;

	static {
		service = new AppleServiceImpl();
	}

	public static void main(String[] args) {
		List<Apple> inventory = service.getAll();

		ListUtils.show(service.getAll());
		System.out.println("=====");
		ListUtils.show(service.getApples(apple->apple.getWeight()>250));
		

		ListUtils.show(service.getApples(apple->"red".equals(apple.getColor())));
	}
}
