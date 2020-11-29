package generic;

public interface Ilist<E> {

	boolean add(E e);
	boolean remove(int index);
	boolean remove(E e);
	boolean update(E e);
	boolean set(int index, E e);
	boolean get(int index);
	boolean isEmpty();
	int size();
 	
	
		
}
