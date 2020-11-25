package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.List;

import bean.Studen;

public class Ex06 {
	public static void main(String[] args) {
		List<Studen> studens = getItems();
		Studen user = new Studen(1, "nam");
		System.out.println(" contains " + studens.contains(user));
		studens.removeIf(studen -> studen.equals(user));
		System.out.println("size+ " + studens.size());
		System.out.println("sorting===========================");

		Comparator<Studen> comp=comparing(student->student.getId());
		Collections.sort(studens,comp.thenComparing(t->t.getName(),reverseOrder()));
		studens.forEach(studen->System.out.println(studen.toString()));
		
	}

	private static List<Studen> getItems() {
		return new ArrayList<>(List.of(
				new Studen(1, "nam"), 
				new Studen(2, "nam"), 
				new Studen(3, "le"),
				new Studen(6, "loc"), 
				new Studen(5, "thai")));
	}
}
