package view;

import java.util.List;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.ListUtils;

public class Demo {
	
	private static AppleService service;
	
	static {
		service =new AppleServiceImpl();
	}
	public static void main(String[] args) {
		
		ListUtils.show(service.getAll());
		System.out.println("_______________________________________________________");
		ListUtils.show(service.getApples(apple -> apple.getColor().equals("red")));
	}
}
