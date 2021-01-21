package bai1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,2,3,3,4,4,5);
		List<Integer> result=list.stream().filter(i->check(list,i)).collect(Collectors.toList());
		for (Integer integer : result) {
			System.out.println(integer);
		}
	}
	public static boolean check(List<Integer> a,Integer num) {
		int dem=0;
		for (Integer integer : a) {
			if(integer==num) {
				dem++;
			}
		}
		if(dem==1) return true;
		return false;
	}
	
}
