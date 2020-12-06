package generic;

import java.util.function.Predicate;

public interface IList<E> {
	boolean add(E e);
	boolean add(int index, E e);
	boolean remove(int index);
	boolean remove(E e);
	boolean set(int index, E e);
	boolean get(int index);
	public boolean isEmpty();
	public int size();
	int count(Predicate<E> predicate);
}