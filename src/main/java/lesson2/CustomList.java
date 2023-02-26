package lesson2;

public interface CustomList<T> {

    void add(T element);

    void add(int index, T element);

    void delete(int index);

    boolean isEmpty();

    int size();

    T get(int index);

    boolean contains(T element);
}
