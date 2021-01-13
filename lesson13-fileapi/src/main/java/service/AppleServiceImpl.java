package service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Apple;

public class AppleServiceImpl implements AppleService{

	@Override
	public List<Apple> getAll() {
		return mockData();
	}
	
	private List<Apple> mockData(){
		return Arrays.asList(
				new Apple("R01", "red", 220, "france"),
				new Apple("G01", "green", 420, "vietnam"),
				new Apple("H01", "yellow", 410, "lao"),
				new Apple("K09", "blue", 390, "vietnam"),
				new Apple("G01", "green", 420, "campuchia"),
				new Apple("L01", "red", 90, "japan")
			);
	}

	@Override
	public List<Apple> findApple(Predicate<Apple> predicate) {
		return mockData().stream().filter(predicate).collect(Collectors.toList());
	}

}
