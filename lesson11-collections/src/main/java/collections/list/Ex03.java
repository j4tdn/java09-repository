package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex03 {
	public static void main(String[] args) {
		
		List<String> sequences = new ArrayList<>();
		sequences.add("cake");
		sequences.add("candy");
		sequences.add("water");
		sequences.add("awater");
		sequences.add("cooking");
		sequences.add("scooking");
		
		String firstElement=sequences.get(0);//lấy
		sequences.set(1, "rice");//thêm,update
		sequences.remove(2); //xóa

		remove(sequences, "c");//xóa theo điều kiện
		sequences.removeIf(t->t.startsWith("s"));
		
		System.out.println("size= "+sequences.size());
		System.out.println("first Element= "+firstElement);
		System.out.println("------------------------------");
		printf(sequences);
	}
	
	private static void remove(List<String> sequences,String text) {

		Iterator<String> iteration=sequences.iterator();
		while(iteration.hasNext()){
			String sequence = iteration.next();
			if(sequence.startsWith(text)) {
				iteration.remove();
			}
		}
		 
//		không thể xóa 1 phần tử trong 1  list chạy( đang sử dụng)		
//		for(String sequence: sequences) {
//			if(sequence.startsWith(text)) {
//				sequences.remove(sequence);
//			}
//		}
	}
	
	
	private static void printf(List<String> sequences) {
		for(String sequence:sequences) {
			System.out.println(sequence);
		}
	}
	
	
}
