package generic;

import java.util.function.Predicate;

public interface IList<E> {
boolean add (E e);
boolean add (int index ,E e);
boolean remove (E e);
boolean remove (int index);
boolean set ( int index, E e);
boolean get ( int index);
boolean isEmpty();
int size();
int count(Predicate<E> predicate);


}
