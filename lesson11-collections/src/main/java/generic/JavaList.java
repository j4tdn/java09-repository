package generic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaultCapacity = 3;
	private int modCount = 0;

	public JavaList() {
		elements = create(defaultCapacity);
	}

	public JavaList(int capacity) {
		if (capacity > defaultCapacity) {
			defaultCapacity = capacity;
		}
		elements = create(defaultCapacity);
	}

	/*public  int count(Predicate<E> predicate , List<E> elements) {
		int count = 0;
		for(E element: elements) {
			if(predicate.test(E)) {
				count++;
			}
		}
		return count;
	}*/
	
	@Override
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E e) {

		if (modCount == defaultCapacity) {
			defaultCapacity++;
			int length = elements.length;
			E[] result = create(defaultCapacity);
			for (int i = 0; i < length; i++) {
				result[i] = elements[i];
			}
			result[modCount++] = e;
			elements = result;
		} else {
			// modCount
			elements[modCount++] = e;
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
	public boolean set(int index, E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean get(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);
	}

	@Override
	public boolean isEmpty() {
		return modCount == 0;
	}

	@Override
	public int size() {
		return modCount;
	}

	@Override
	public int count(Predicate<E> predicate) {
		int count = 0;
		if(predicate == null) {
			return elements.length;
		}
		for(int i = 0; i < modCount ; i++) {
			if(elements[i] != null && predicate.test(elements[i]) ) {
				count++;
			}
		}
		return count;
	}
}
