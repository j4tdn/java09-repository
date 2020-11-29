package generic;

import java.lang.reflect.Array;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defautCapacity = 10;
	private int modCount = 0;

	@SuppressWarnings("unchecked")
	public JavaList() {
		// elements = (E[]) Array.newInstance(Object.class, 0);
		elements = create(defautCapacity);

	}

	public JavaList(int capacity) {
		if (capacity > defautCapacity) {
			defautCapacity = capacity;
		}
		elements = create(defautCapacity);

	}

	@Override
	public boolean add(E e) {

		int length = elements.length;

		if (modCount == defautCapacity) {
			defautCapacity++;
			E[] result = create(defautCapacity);
			for (int i = 0; i < result.length; i++) {
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
	public boolean get(int index) {
		return false;
	}

	@Override
	public boolean remove(E e) {
		return false;
	}

	@Override
	public boolean remove(int index) {
		return false;
	}

	@Override
	public boolean set(int index, E e) {
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

	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);
	}

}
