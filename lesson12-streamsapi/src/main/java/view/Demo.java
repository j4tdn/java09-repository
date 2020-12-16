package view;

import java.util.List;

import bean.Apple;
import bean.Test;
import service.AppleService;
import service.AppleServiceImpl;
import utils.ListUtils;

public class Demo {
	private static AppleService service;
	
	static {
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Apple> invertory = service.getAll();
		ListUtils.show(invertory);
		System.out.println("==========================");
		ListUtils.show(service.findApple(apple -> "green".equals(apple.getColor())));
		System.out.println("==========================");
		ListUtils.show(service.findApple(apple -> "red".equals(apple.getColor())));
		System.out.println("==========================");
		ListUtils.show(service.findApple(apple -> apple.getWeight() > 150));
		System.out.println("==========================");
		ListUtils.show(service.findApple(apple -> apple.getWeight() > 150 && "green".equals(apple)));
		
	}
	
	private static void call(Test test) {
		System.out.println(test);
	}
}
