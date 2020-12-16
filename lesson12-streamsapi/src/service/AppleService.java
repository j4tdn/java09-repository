package service;

import java.util.List;
import java.util.function.Predicate;

import bean.Apple;

//dao, service pattern
public interface AppleService {
	List<Apple> getAll();
	/*List<Apple> getGreenApples();
	List<Apple> getRedApples();
	List<Apple> getHeavyApples();
	List<Apple> getApplesByColorAndWeight();*/
	List<Apple> getApples(Predicate<Apple> predicate);



}
