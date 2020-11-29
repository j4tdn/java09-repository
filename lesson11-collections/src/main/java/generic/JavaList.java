package generic;

import java.lang.reflect.Array;

public class JavaList<E> implements IList<E> {
	private E[] elements;
	private int defaulCapacity = 10;
	private int modCount = 0;

	@SuppressWarnings("unchecked")
	public JavaList() {
		elements = (E[]) Array.newInstance(Object.class, defaulCapacity);
	}

	public JavaList(int capacity) {
		if (capacity > defaulCapacity) {
			defaulCapacity = capacity;
		}
		elements = create(defaulCapacity);
	}

	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);
	}

	@Override
	public boolean add(E e) {
		int length = elements.length;

		if (modCount == defaulCapacity) {
			defaulCapacity++;
			E[] result = create(defaulCapacity);
			for (int i = 0; i < length; i++) {
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

	@Override
	public int size() {
		return modCount;
	}

	@Override
	public boolean isEmpty() {
		return modCount == 0;
	}

}
