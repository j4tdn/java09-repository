package ex03;

import java.util.List;
import java.util.function.Predicate;



public interface StudentSevices {
	List<Student> getAll();
	List<Student> getApples(Predicate<Student> predicate);

}
