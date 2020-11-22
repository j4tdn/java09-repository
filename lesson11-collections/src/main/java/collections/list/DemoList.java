package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
	public static void main(String[] args) {
		List<String> sequences =new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("smallcake");
		sequences.add("bigcookie");
		sequences.add("chocopie");
		sequences.add("water");
	
		
		//remove
		//sequences.remove("cake");
		remove(sequences,"c");
		
		sequences.removeIf(t -> t.startsWith("s"));
		
		printf(sequences);
	}
	private static void printf(List<String> sequences) {
		for(String sequence : sequences) {
			System.out.print(sequence + " ");
		}
	}
	private static void remove(List<String> sequences,String text) {
//		for(String str : sequences) {
//			if (str.startsWith(text)) { // sai vi khi thay doi 1 cai list thi vong for se bao loi
//				sequences.remove(str);
//			}
//		}
		Iterator<String> iterator = sequences.iterator();
		while(iterator.hasNext()) {//kiem tra xem con phan tu hay ko
			String sequence = iterator.next();// lay phan tu nay ra
			if (sequence.startsWith(text)) { 
			iterator.remove();
		}
		}
	}
}
