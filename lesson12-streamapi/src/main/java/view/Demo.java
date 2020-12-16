package view;

import java.util.List;

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
		ListUtils.show(inventory);
		System.out.println("---------------------------");
		ListUtils.show(service.getApples(a -> "green".equals(a.getColor())));
	}
}
