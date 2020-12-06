package generic;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaultCapacity = 10;
	private int modCount = 0;

	public JavaList() {
		elements = create(defaultCapacity);
	}

	public JavaList(int capacity) {
		defaultCapacity = capacity > defaultCapacity ? capacity : defaultCapacity;
		elements = create(defaultCapacity);
	}

	@Override
	public boolean add(E e) {
		if (modCount == defaultCapacity) {
			defaultCapacity += 1;
			E[] result = create(defaultCapacity);
			for (int i = 0; i < modCount; i++) {
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

		return false;
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
		if (predicate == null) {
			return elements.length;
		}
		int count = 0;
		for (int i = 0; i < modCount; i++) {
			if (elements[i] != null && predicate.test(elements[i])) {
				count++;
			}
		}
		return count;
	}

}