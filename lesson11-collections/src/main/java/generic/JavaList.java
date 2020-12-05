package generic;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class JavaList<E> implements IList<E> {

	private E[] elements;
	private int defaultCaparaty = 10;
	private int modCount = 0;

	public JavaList() {
		elements = create(defaultCaparaty);
	}

	public JavaList(int caparaty) {
		if (caparaty > defaultCaparaty) {
			defaultCaparaty = caparaty;
		}
		elements = create(defaultCaparaty);
	}

	@Override
	public boolean add(E e) {
		int length = elements.length;
		if (modCount == defaultCaparaty) {
			defaultCaparaty++;
			E[] result = create(defaultCaparaty);
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
	public int hashCode() {
		return elements.hashCode();
	}

	@Override
	public int count(Predicate<E> predicate) {
		if (predicate == null) {
			return modCount;
		}
		int count = 0;
		for (int i = 0; i<modCount; i++) {
			if (elements[i] != null && predicate.test(elements[i])) {
				count++;
			}
		}
		return count;
	}

}
