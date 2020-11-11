package exercise1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = new Student[11];
	    students[0] = new Student(102,"Nam", Rank.C);
	    students[1] = new Student(104,"Hoang", Rank.D);
	    students[2] = new Student(109,"Lan", Rank.A);
	    students[3] = new Student(103,"Bao", Rank.F);
	    students[4] = new Student(105,"Nguyen", Rank.B);
	    students[5] = new Student(107,"Vu", Rank.F);
	    students[6] = new Student(103,"Bao", Rank.F);
	    students[7] = new Student(202,"Dat", Rank.C);
	    students[8] = new Student(107,"Vu", Rank.C);
	    students[9] = new Student(193,"Bao", Rank.B);
	    students[10] = new Student(199,"Tai", Rank.A);
	    Student result[] = getStudentLearnAgain(students);
	    for (Student x : result) {
	    	System.out.println(x.getName());
	    }
	    
	}
	
	private static Student[] getStudentRankA (Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (int i = 0;i<students.length;i++) {
			if (students[i].getRank() == Rank.A) {
				result[index++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static Student[] getStudentLearnAgain (Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for (int i=0; i<students.length;i++) {
			int count =0;
			if (students[i].getRank() == Rank.F) {
				for (int j =0;j < i; j++) {
					if (students[i].getId() == students[j].getId()) {
						count++;
					}
				}
				if (count == 1) {
					result[index++] = students[i];
				}
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
}
