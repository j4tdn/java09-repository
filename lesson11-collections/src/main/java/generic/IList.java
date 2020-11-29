package generic;

public interface IList<E> {
	boolean add(E e);

	boolean add(int index, E e);

	boolean remove(int index);

	boolean remove(E e);

	boolean update(E e);

	boolean set(int index, E e);

	boolean get(int index);

	boolean isEmpty();

	int size();
}
