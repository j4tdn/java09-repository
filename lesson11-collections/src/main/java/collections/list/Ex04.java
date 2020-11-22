package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static collection.util.ListUtil.*;
import  collection.util.ListUtil;

public class Ex04 {
	public static void main(String[] args) {
		List<String> studen=Arrays.asList(
				"nam","hoang", "teo","nguyen"
				);
		
		
		Collections.reverse(studen);
		Collections.shuffle(studen);
		printf(studen);
		System.out.println("contains:  "+ studen.contains("nam"));
	}
}
