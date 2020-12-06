package collections.set;

import java.util.HashSet;
import java.util.Set;

import bean.Studen;
import collections.utils.CollectionUtils;
import collections.utils.ListUtil;

public class Ex02 {
public static void main(String[] args) {
	Set<Studen> students = new HashSet<>();
	
	students.add(new Studen(1, "dd"));
	students.add(new Studen(1, "dd"));
	students.add(new Studen(3, "ss"));
	
	CollectionUtils.printf(students);
	
	}
}
