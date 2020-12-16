package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public class AppleServiceImpl implements AppleService {
	@Override
	public List<Apple> getAll() {
		return mockData();
	}

	private List<Apple> mockData() {
		return Arrays.asList(new Apple("R01", "red", 220, "viet nam"),
				new Apple("G02", "green", 420, "lao"),
				new Apple("R01", "red", 220, "lao"));
	}

	@Override
	public List<Apple> getApples(Predicate<Apple> predicate) {

		List<Apple> data= mockData();
		List<Apple> result=new ArrayList<>();
		for(Apple apple: data) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		
		
		return result;
	}

	
}
