package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public class AppleServiceImpl implements AppleService{
	
	@Override
	public List<Apple> getAll(){
		return mockData();
	}
	
	public List<Apple> mockData() {
		return Arrays.asList(
				new Apple("r01","red",220,"viet nam"),
				new Apple("r01","red",220,"viet nam"),
				new Apple("r01","red",220,"viet nam"),
				new Apple("r01","red",220,"viet nam"),
				new Apple("r01","red",220,"viet nam"),
				new Apple("r01","red",220,"viet nam")
				);
	}
	@Override
	public List<Apple> getApples(Predicate<Apple> predicate) {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple: data) {
			if ( predicate.test(apple)) {
				result.add(apple);
			}

		}		return null;
		
	}

}
