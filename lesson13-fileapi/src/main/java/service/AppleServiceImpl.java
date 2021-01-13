package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public class AppleServiceImpl implements AppleService {
	// get data from file or database
	// temporary: mock data
	public List<Apple> getAll() {
		return mockData();
	}

	public List<Apple> getApples(Predicate<Apple> predicate) {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<>();
		for (Apple apple : data) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	private List<Apple> mockData() {
		return Arrays.asList(new Apple("red", "A01", 220, "Da Nang"), new Apple("red", "A02", 420, "Ca Mau"),
				new Apple("yellow", "A03", 600, "Can Tho"), new Apple("green", "A04", 150, "Da Nang"),
				new Apple("yellow", "A05", 260, "Ha Noi"));
	}
}
