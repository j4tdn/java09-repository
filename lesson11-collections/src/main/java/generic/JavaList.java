package generic;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaultCapacity = 3;
	private int size = 0;

	public JavaList() {
		elements = create(defaultCapacity);
	}

	public JavaList(int capacity) {
		if (capacity > defaultCapacity) {
			defaultCapacity = capacity;
		}
		elements = create(defaultCapacity);
	}

	@Override
	public boolean add(E e) {
		if (size == elements.length) {
			E[] result = create(size + 1);
			for(int i = 0; i < elements.length; i++) {
				result[i] = elements[i];
			}
			result[size] = e;
			elements = result;
		} else {
			elements[size] = e;
		}
		return true;
	}

	@Override
	public boolean add(int index, E e) {
		return false;
	}

	@Override
	public boolean remove(int index) {
		return false;
	}

	@Override
	public boolean remove(E e) {
		return false;
	}

	@Override
	public boolean set(int index, E e) {
		return false;
	}

	@Override
	public boolean get(int index) {
		return false;
	}

	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public int count(Predicate<E> predicate) {
		if (predicate == null) {
			return elements.length;
		}
		int count = 0;
		for(int i = 0; i < size; i++) {
			if (elements[i] != null && predicate.test(elements[i])) {
				count++;
			}
		}
		return count;
	}
	
	@Override
	public String toString() {
		for (int i = 0; i < size; i++) {
			System.out.println(elements[i]);
		}
		return "";
	}
	
	@Override
	public int hashCode() {
		return elements.hashCode();
	}

}
