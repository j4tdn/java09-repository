package ex01;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[11];
		students[0] = new Student(190, "Tài",Rank.A );
		students[1] = new Student(102, "Nam",Rank.C );
		students[2] = new Student(104, "Hoàng",Rank.D );
		students[3] = new Student(109, "Lan",Rank.A );
		students[4] = new Student(103, "Bảo",Rank.F );
		students[5] = new Student(105, "Nguyên",Rank.B );
		students[6] = new Student(107, "Vũ",Rank.F );
		students[7] = new Student(101, "Bảo",Rank.C );
		students[8] = new Student(202, "Đạt",Rank.C );
		students[9] = new Student(103, "Bảo",Rank.B );
		students[10] = new Student(107, "Vũ",Rank.C);
		
		Student[] studentsA = getStudentA(students);
		for (int i = 0; i < studentsA.length; i++) {
			System.out.println(studentsA[i]);
		}
		
		System.out.println("====");
		Student[] studentsB = getLearnAgainStudent(students);
		for (int i = 0; i < studentsB.length; i++) {
			System.out.println(studentsB[i]);
		}
	}
	
	private static Student[] getStudentA(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for(int i = 0;i<students.length;i++) {
			if(students[i].getRank() == getEnum(0)) {
				result[index++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static Student[] getLearnAgainStudent(Student[] students) {
		Student[] result = new Student[students.length];
		int index = 0;
		for(int i = 0;i<students.length;i++) {
			for (int j = 0; j < students.length; j++) {
				if(students[i].getRank() == getEnum(5) && (i != j)
						&& students[i].getId() == students[j].getId() && students[j].getRank() != getEnum(5)) {
					result[index++] = students[i];
				}
			}
		}
		return Arrays.copyOfRange(result, 0, index);
	}
	
	private static Rank getEnum(int i) {
		return Rank.values()[i];
	}
}
