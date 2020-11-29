package generic;

import java.lang.reflect.Array;

public class JavaList<E> implements IList<E> {
	private E[] elements;
	private int defaultCapacity = 10;
	private int modCount = 0;

	@SuppressWarnings("unchecked")
	public JavaList(int capacity) {
		if (capacity > defaultCapacity) {
			defaultCapacity = capacity;
		}
		elements = (E[]) Array.newInstance(Object.class, defaultCapacity);
	}

	public JavaList() {
		elements = (E[]) Array.newInstance(Object.class, defaultCapacity);
	}

	@Override
	public boolean add(E e) {
		int length = elements.length;
		if (modCount == defaultCapacity) {
			defaultCapacity++;
			E[] result = (E[]) Array.newInstance(Object.class, defaultCapacity);
			for(int i = 0; i < result.length; i++) {
				result[i] = elements[i];
			}
			result[modCount++] = e;
		} else {
			elements[modCount++] = e;
			
		}
		return true;
	}

	@Override
	public boolean add(int index, E e) {
		E[] result = (E[]) Array.newInstance(Object.class, elements.length + 1);
		for (int i = 0; i < index; i++) {
			result[i] = elements[i];
		}
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
	public boolean set(int index) {
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
		// TODO Auto-generated method stub
		return modCount;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return modCount == 0;
	}

}
