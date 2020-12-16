package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public class AppleServiceImpl implements AppleService {
	
	@Override
	//get data from file, database
	//temporary: mock data
	public List<Apple> getAll() {
		
		return mockData();
	}

	
	private List<Apple> mockData(){
		return Arrays.asList(
				new Apple("R01", "red", 220, "Viet Nam"),
				new Apple("R02", "green", 420, "Lao"),
				new Apple("R03", "yellow", 220, "Brunei"),
				new Apple("R04", "pink", 180, "Lao")

				);	
		}


	@Override
	public List<Apple> getApples(Predicate<Apple> predicate) {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<>();
		for(Apple apple: data) {
			if(predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	

	/*@Override
	public List<Apple> getGreenApples() {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<>();
		for(Apple apple: data) {
			if("green".equals(apple.getColor()))
				 result.add(apple);
		}
		return result;
	}


	@Override
	public List<Apple> getRedApples() {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<>();
		for(Apple apple: data) {
			if("red".equals(apple.getColor()))
				 result.add(apple);
		}
		return result;
	}


	@Override
	public List<Apple> getHeavyApples() {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<>();
		for(Apple apple: data) {
			if(apple.getWeight()>150)
				 result.add(apple);
		}
		return result;
	}


	@Override
	public List<Apple> getApplesByColorAndWeight() {
		List<Apple> data = mockData();
		List<Apple> result = new ArrayList<>();
		for(Apple apple: data) {
			if(apple.getWeight()>150 && "green".equals(apple.getColor()))
				 result.add(apple);
		}
		return result;
	}*/
	

}
