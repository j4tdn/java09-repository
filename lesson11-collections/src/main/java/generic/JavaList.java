package generic;

import java.lang.reflect.Array;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaulCapacity=10;
	private int modCount;
	
	
	public JavaList() {
		elements=create(defaulCapacity);
	
	}
	
	public JavaList(int capacity) {
		elements=create(capacity > defaulCapacity? capacity: defaulCapacity);
	
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int index, E e) {
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
	public boolean isEmpty() {
		return elements.length==0;
	}

	@Override
	public int size() {
		return elements.length;
	}
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, 0);
	}

	@Override
	public int hashCode() {
		return elements.hashCode();
	}
}
