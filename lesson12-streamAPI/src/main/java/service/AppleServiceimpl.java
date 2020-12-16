package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public class AppleServiceimpl implements AppleService {

	public AppleServiceimpl() {
	}

	public List<Apple> getAll() {
		return mockData();
	}


	private List<Apple> mockData() {
		return Arrays.asList(new Apple("R01", "Red", 220, "Da Nang"), new Apple("R02", "green", 220, "Lao"),
				new Apple("R02", "Red", 260, "Brunei"), new Apple("Y01", "yellow", 150, "Trung Quoc"),
				new Apple("Y02", "yellow", 220, "Lao"));
	}
	
	@Override
	public List<Apple> getApples(Predicate<Apple> predicate) {
		List<Apple> data = mockData();
		List<Apple> result= new ArrayList<>();
		for(Apple apple : data) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
