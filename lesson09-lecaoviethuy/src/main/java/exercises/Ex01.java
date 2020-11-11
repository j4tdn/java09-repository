package exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import entities.Rank;
import entities.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = {
					new Student(102, "Nam", Rank.C),
					new Student(104, "Hoàng", Rank.D),
					new Student(109, "Lan", Rank.A),
					new Student(103, "Bảo", Rank.F),
					new Student(105, "Nguyên", Rank.B),
					new Student(107, "Vũ", Rank.F),
					new Student(103, "Bảo", Rank.F),
					new Student(202, "Đạt", Rank.C),
					new Student(107, "Vũ", Rank.C),
					new Student(193, "Bảo", Rank.B),
					new Student(199, "Tài", Rank.A)
				};
		
		System.out.println("Tìm danh sách sinh viên từng đạt loại A trong năm 2020");
		Student[] rankAStudents = getStudents(students, student -> student.getRank() == Rank.A);
		show(rankAStudents);
		
		System.out.println("Tìm danh sách sinh viên tham gia học lại môn cấu trúc dữ liệu trong năm 2020");
		Set<Student> studentSet = new HashSet<>();
		Student[] learnAgainStudents = getStudents(students, student -> !studentSet.add(student));
		show(learnAgainStudents);
		
	}
	
	private static Student[] getStudents(Student[] students, Predicate<Student> predicate) {
		return Arrays.stream(students).filter(predicate).toArray(Student[]::new);
	}
	
	private static void show(Student[] students) {
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
