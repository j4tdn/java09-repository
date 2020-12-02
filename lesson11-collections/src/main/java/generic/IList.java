package generic;

import java.util.function.Predicate;

public interface IList<E> {
	boolean add(int index, E e);
	boolean add(E e);
	boolean remove(int index);
	boolean remove(E e);
	boolean set(int index);
	E get(int index);
	int size();
	boolean isEmpty();
	int count(Predicate<E> predicate);
}
