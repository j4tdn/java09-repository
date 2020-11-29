package generic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaList<E> implements Ilist<E> {

	private E[] elements;
	private int defaultCapacity = 10;
	private int modCount = 0;

	@SuppressWarnings("unchecked")
	public JavaList() {

		elements = create(0);
	}

	public JavaList(int capacity) {
		if (capacity > defaultCapacity) {
			defaultCapacity = capacity;
		}
		elements = create(defaultCapacity);
	}

	private E[] create(int i) {
		// TODO Auto-generated method stub
		return (E[]) Array.newInstance(Object.class, 10);
	}

	@Override
	public boolean add(E e) {
		int length = elements.length;
		if (modCount == defaultCapacity) {
			defaultCapacity++;
			E[] result = create(defaultCapacity);
			for (int i = 0; i < length; i++) {
				result[i] = elements[i];
			}
			result[modCount++] = e;
		} else {
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
		// TODO Auto-generated method stub
		return modCount == 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return modCount;
	}

}
