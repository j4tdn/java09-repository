package generic;

import java.lang.reflect.Array;

public class JavaList<E> implements Ilist<E> {
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

	public boolean add(E e) {
		if (modCount == defaultCapacity) {
			defaultCapacity+=1;
			E[] result = create(defaultCapacity);
			for (int i = 0; i < modCount; i++) {
				result[i] = elements[i];
			}
			result[modCount++] = e;
			elements=result;

		} else {
			elements[modCount++] = e;

		}

		return true;
	}

	@Override
	public boolean add(int index, Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("UNCHECK")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, 0);
	}

	@Override
	public boolean remove(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean set(int index, Object e) {
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
