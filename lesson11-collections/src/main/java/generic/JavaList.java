package generic;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaulCapacity=5;
	private int modCount=0;
	
	
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
	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, size);
	}

	@Override
	public int hashCode() {
		return elements.hashCode();
	}

	@Override
	public int count(Predicate<E> predicate) {
		if(predicate==null) {
			return elements.length;
		}
		int count=0;
		for(int i=0;i>modCount;i++) {
			if(predicate.test(elements[i])) {
				count++;
			}
		}
		
		return count;
	}


}
