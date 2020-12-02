package generic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {
	private E[] elements;
	private int capacity = 10;
	private int modCount = 0;
	
	public JavaList() {
		create(capacity);
	}

	private void create(int capacity) throws OutOfMemoryError {
		elements = (E[]) Array.newInstance(Object.class, capacity);
	}
	
	@Override
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E e) {
		try {
			if(modCount == capacity) {
				capacity++;
				E[] tmp = Arrays.copyOf(elements, capacity);
				tmp[elements.length] = e;
				elements = tmp;
			} else {
				elements[modCount] = e;
			}
			modCount++;
		} catch (OutOfMemoryError e2) {
			return false;
		}
		
		return true;
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean set(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		try {
			return elements[index];
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public int size() {
		return modCount;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return modCount == 0;
	}

	@Override
	public int count(Predicate<E> predicate) {
		int count = 0;
		for(int i = 0; i < modCount; i++) {
			if(predicate.test(elements[i])) {
				count++;
			}
		}
		return count;
	}

}
