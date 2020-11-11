package bai1;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai1 {
	public static void main(String[] args) {
		Student nam = new Student("102", "Nam", Title.C);
		Student hoang = new Student("104", "Hoang", Title.D);
		Student lan = new Student("109", "Lan", Title.A);
		Student bao1 = new Student("103", "Bao", Title.F);
		Student nguyen = new Student("105", "Nguyen", Title.B);
		Student vu1 = new Student("107", "Vu", Title.F);
		Student bao2 = new Student("103", "Bao", Title.F);
		Student dat = new Student("202", "Dat", Title.C);
		Student vu2 = new Student("107", "Vu", Title.C);
		Student bao3 = new Student("193", "Bao", Title.B);
		Student tai = new Student("199", "Tai", Title.A);
		Student[] students = { nam, hoang, lan, bao1, nguyen, vu1, bao2, dat, vu2, bao3, tai };
		Student[] cauA = getATitleStudents(students);
		ArrayList<Student> cauB = getReStudyingStudents(students);
		System.out.println("Những học sinh được loại A là :");
		for (Student s : cauA) {
			System.out.println(s.getMSV() + "-" + s.getName() + "-" + s.getTitle());
		}
		System.out.println("Những học sinh học lại môn cơ sở dữ liệu là :");
		for (Student s : cauB) {
			System.out.println(s.getMSV() + "-" + s.getName() + "-" + s.getTitle());
		}
	}

	public static Student[] getATitleStudents(Student[] students) {
		Student[] result = new Student[students.length];
		int i = 0;
		for (Student s : students) {
			if (s.getTitle() == Title.A) {
				result[i++] = s;
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}

	public static ArrayList<Student> getReStudyingStudents(Student[] students) {
		ArrayList<Student> result = new ArrayList<Student>();
		int count = 0;
		for (Student student : students) {
			int check = 0;
			for (Student studentTemp : students) {
				if (student.getMSV().equals(studentTemp.getMSV())) {
					check++;
				}
			}
			if (check > 1) {
				int check2 = 0;
				for (Student s : result) {
					if (s.getMSV().equals(student.getMSV())) {
						check2++;
					}
				}
				if (check2 == 0) {
					result.add(student);
				}
			}
		}
		return result;
	}
}
