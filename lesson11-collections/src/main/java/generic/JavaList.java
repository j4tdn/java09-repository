package generic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaultCapacity = 4;
	private int modCount =0;

	public JavaList() {
		elements = create(defaultCapacity);
	}
	
	public JavaList (int capacity) {
		if (capacity > defaultCapacity) {
			defaultCapacity = capacity;
		}
		elements = create(defaultCapacity);
	}
	@SuppressWarnings({ "unused", "unchecked" })
	private E[] create(int length) {
		return (E[]) Array.newInstance(Object.class, length);
	}

	@Override
	public boolean add(E e) {
		int length = elements.length;
		if (modCount == defaultCapacity) {
			defaultCapacity++;
			E[] result = create(defaultCapacity);
			for (int i =0; i< elements.length;i++) {
				result[i] = elements[i];
			}
			result[modCount++] = e;
			elements = result;
		} else {
			elements[modCount++] = e;
		}
		
		return true;
	}

	@Override
	public boolean add(int index, E e) {
		E[] tmp = create(elements.length + 1);
		for (int i = 0; i < index; i++) {
			tmp[i] = elements[i];
		}
		tmp[index] = e;
		for (int i = index + 1; i < tmp.length; i++) {
			tmp[i] = elements[i - 1];
		}
		elements = tmp;
		return true;
	}

	@Override
	public boolean remove(int index) {

		return false;
	}

	@Override
	public boolean remove(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(E e) {
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

	@Override
	public boolean isEmpty() {
		return modCount == 0;
	}

	@Override
	public int size() {
		return modCount;
	}
	
	@Override
	public int count (Predicate<E> predicate) {
		int result = 0;
		for (int i =0 ; i< modCount;i++) {
			if (elements[i] != null && predicate.test(elements[i])) {
				result++;
			}
		}
		return result;
	}

}
