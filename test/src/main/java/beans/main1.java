package beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main1 {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(4);
		List<Integer> b =  a.subList(0, 4);
		Collections.sort(b);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));;
		}
	}
}
