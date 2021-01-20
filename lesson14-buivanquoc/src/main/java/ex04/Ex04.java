package ex04;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex04 {
public static void main(String[] args) {
	List<Student> students= getAll();
	Collections.sort(students,new Comparator<Student>()
	 {
         @Override
         public int compare(Student o1, Student o2) {
             return (int)(o1.getPoint() - o2.getPoint());
         }
     });
	students.stream().forEach(System.out::println);
//	List<Student> result0=students.stream().sorted(student->student.getPoint).collect(Collectors.toList());
//	result0.stream().forEach(System.out::println);
	System.out.println("==============================");
	List<Student> result=students.stream().filter(student ->student.getPoint()>8).collect(Collectors.toList());
	result.stream().forEach(System.out::println);
	System.out.println("===============================");
	List<Student> result1=students.stream().filter(student ->student.getGender().equals("Nu")).collect(Collectors.toList());
	result1.stream().forEach(System.out::println);
	System.out.println("===============================");
	List<Student> result2=students.stream().distinct().collect(Collectors.toList());
	result2.stream().forEach(System.out::println);
	System.out.println("===============================");
}
public static List<Student> mockData()
{
	return Arrays.asList( 
			new Student("102130174", "Le Na", 7.8, "Nu"),
			new Student("102120125", "Hoang Nam", 8.2, "Nam"),
			new Student("102130176", "Van Cuong", 9.8, "Nam"),
			new Student("102130177", "Van Cuong", 6.8, "Nam"),
			new Student("102130178", "Ngoc Nu", 9.1, "Nu"),
			new Student("102130180", "Hoang Nhung", 7.8, "Nu"));
}
public static List<Student> getAll()
{
	return mockData();
}

}
