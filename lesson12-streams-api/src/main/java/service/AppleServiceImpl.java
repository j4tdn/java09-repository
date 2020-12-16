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
		return Arrays.asList(new Apple("R01", "red", 220, "Viet Nam"), 
				new Apple("G02", "green", 420, "Lao"),
				new Apple("R02", "red", 260, "Bruinew"),
				new Apple("Y01", "yellow", 180, "Lao"),
				new Apple("Y01", "black", 220, "Lao"));

	}



	@Override
	public List<Apple> getApples(Predicate<Apple> predicate) {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple: data) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	
}

