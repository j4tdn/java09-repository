package service;

import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

public interface AppleService {
	
	List<Apple> getAll();
//	List<Apple> getGreenApple();
//	List<Apple> getRedApple();
//	List<Apple> getHeavyApple();
//	List<Apple> getAppleByColorAndWeight();
	List<Apple> getApples(Predicate<Apple> predicate);

}
