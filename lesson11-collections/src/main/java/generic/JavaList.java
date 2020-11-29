package generic;

import java.lang.reflect.Array;

import javax.lang.model.element.Element;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaultCaparaty = 10;
	
	public  JavaList(int caparaty) {
		
	}

	@SuppressWarnings("unchecked")
	public JavaList() {
		elements = (E[]) Array.newInstance(Object.class, 0);
	}

	@Override
	public boolean add(E e) {
		final int length = elements.length;
		E[] result = create(elements.length + 1);
		for(int i = 0; i < elements.length; i++) {
			result[i] = elements[i];	
		}
		result[length] = e;
		elements = result;
		return true;
	}

	@Override
	public boolean add(int index, E e) {
		
		return false;
	}

	@Override
	public boolean remove(int index) {
		
		return false;
	}

	@Override
	public boolean remove(E e) {
		
		return false;
	}

	@Override
	public boolean set(int index, E e) {
		
		return false;
	}

	@Override
	public boolean get(int index) {
		
		return false;
	}
	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[]) Array.newInstance(Object.class, 0);
	}

	@Override
	public boolean isEmpty() {
		
		return elements.length == 0;
	}

	@Override
	public int size() {
		
		return elements.length;
	}

}
