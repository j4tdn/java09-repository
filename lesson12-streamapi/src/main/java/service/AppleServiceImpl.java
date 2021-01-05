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
				new Apple("r01","red",220,"Viet Nam"),
				new Apple("r02","blue",220,"Phap"),
				new Apple("r03","green",220,"My"),
				new Apple("r04","black",220,"Trung"),
				new Apple("r05","red",220,"Viet Nam"),
				new Apple("r06","blue",220,"Thai Lan")
				);
	}
	@Override
	public List<Apple> getApples(Predicate<Apple> predicate) {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<>();
		for (Apple apple: data) {
			if ( predicate.test(apple)) {
				result.add(apple);
			}

		}		return null;
		
	}

}
