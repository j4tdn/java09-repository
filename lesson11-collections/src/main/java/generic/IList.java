package generic;

public interface IList<E> {
	boolean add(int index, E e);
	boolean add(E e);
	boolean remove(int index);
	boolean remove(E e);
	boolean set(int index, E e);
	boolean get(int index);
	boolean isEmpty();
	int size();
	
}
