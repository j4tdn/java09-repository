package view;

import java.util.List;
import java.util.function.Predicate;

import bean.Apple;
import service.AppleService;
import service.AppleServiceimpl;
import utils.ListUtils;

public class Demo {
	private static AppleService service;

	static {
		service = new AppleServiceimpl();
	}

	public static void main(String[] args) {
		ListUtils.show(service.getAll());
		System.out.println("---------------------------");
		ListUtils.show(service.getApples(apple->apple.getWeight()>150));
		System.out.println("---------------------------");
		ListUtils.show(service.getApples(apple->"Red".equals(apple.getColor())));
}
}

