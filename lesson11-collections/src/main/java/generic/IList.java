package generic;

import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);
	boolean add(int index);
	boolean remove(int index);
	boolean remove(E e);
	boolean set(int index, E e);
	boolean get(int index);
	int size();
	boolean isEmpty();
	int count(Predicate <E> predicate);
}
