package stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02FilteringAndSlicing {
	private static final AppleService service;
	
	static {
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Apple> inventory = service.getAll();
		
		String[] data = Pattern.compile(",")
			.splitAsStream("a,j,fdg,ds,df,sd,e,r,vc,df")
			.toArray(String[]::new);
		
		// distinct by color, origin
	}
}
