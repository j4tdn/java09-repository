package stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;

import org.w3c.dom.ls.LSInput;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex03Mapping {
	private static AppleService service = new AppleServiceImpl();
	private static List<Apple> inventory;
	static {
		service = new AppleServiceImpl();
		inventory = service.getAll();
	}

	public static void main(String[] args) {
		List<Integer> ids = inventory.stream().map(Apple::getId).map(String::length).collect(Collectors.toList());
		ids.forEach(id -> System.out.println(id + " "));

		List<List<String>> cards = Arrays.asList(Arrays.asList("2 rô", "3 bích ", "4 chuồn"),
				Arrays.asList("4 rô", "5 bích ", "7 chuồn"), Arrays.asList("3 cơ", "8 bích ", "2 chuồn"));
		List<String> result = cards.stream()// stream <List<String>>
				.flatMap(Collection::stream).filter(card -> card.startsWith("2")).collect(Collectors.toList()); //
		result.forEach(card -> System.out.print(cards + " "));
	}

}
