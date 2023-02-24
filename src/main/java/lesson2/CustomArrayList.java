package lesson2;


import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private int size = 0;
    private int capacity = 10;
    private Object[] arr = new Object[capacity];


    @Override
    public void add(T element) {
        if (isOutOfArray()) {
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);
        }
        arr[size] = element;
        size++;
    }

    @Override
    public void add(int index, T element) {
        if (index > size) throw new IndexOutOfBoundsException();
        arr[index] = element;
    }

    @Override
    public void delete(int index) {
        if (index > size) throw new IndexOutOfBoundsException();
        if (size - index >= 0) System.arraycopy(arr, index + 1, arr, index, size - index);
        size--;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if(index > size) throw new IndexOutOfBoundsException();
        return (T) arr[index];
    }

    @Override
    public boolean contains(T element) {
     return Arrays.stream(arr).anyMatch(e -> e == element);

    }

    private boolean isOutOfArray() {
        return capacity <= size;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            str.append(arr[i]);
            if (i != size-1) str.append(", ");
        }
        str.append("]");
        return str.toString();
    }
}
