package maindemo;
import object.Student;

public class StudentDemo {
	public static void main(String[] args) {
		Student sv1 = new Student(102170009, "Lê Văn Cường", 8, 9);
		Student sv2 = new Student(102170010, "Lê A", 10, 10);
		Student sv3 = new Student();
		sv3.input();
		System.out.printf("%-20s%-30s%-20s%-20s%-20s\n", "ID", "Name", "TheoryPoint", "PracticePoint","AveragePoint");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	}
}
