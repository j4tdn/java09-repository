package generic;

import java.lang.reflect.Array;

public class JavaList<E> implements IList<E> {
	
	private E[] element;
	
	public JavaList() {
		element = (E[])Array.newInstance(Object.class, 100);
	}
	
	@SuppressWarnings("unchecked")
	private E[] create(int size) {
		return (E[])Array.newInstance(Object.class, size);
	}
	

	@Override
	public boolean add(E e) {
		
		final int length = element.length;
		E[] a = create(length +1);
		
		int i =0;
		for (E c : element ) {
			a[i++] = c;
		}
		a[length] = e;
		
		element = a;
		
		return true;
	}

	@Override
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
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
	public boolean isEmty() {
		// TODO Auto-generated method stub
		return element.length==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return element.length;
	}
	

}
