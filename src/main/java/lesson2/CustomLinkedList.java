package lesson2;


public class CustomLinkedList<T> implements CustomList<T> {

    private Node<T> head;
    private Node<T> tall;
    private int size = 0;


    private static class Node<T> {
        private Node<T> next;
        private Node<T> prev;
        T value;
        int index;

        public Node(Node<T> prev, Node<T> next, T value, int index) {
            this.prev = prev;
            this.next = next;
            this.value = value;
            this.index = index;
        }
    }


    @Override
    public void add(T element) {
        if (isEmpty()) {
            tall = new Node<>(null, null, element, size);
            head = tall;
        } else {
            Node<T> newNode = new Node<>(tall, null, element, size);
            tall.next = newNode;
            tall = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, T element) {
        if (index > size || index < 0 ) throw new IndexOutOfBoundsException();
        Node<T> current = head;
        while (current != null) {
            if (current.index == index) {
                current.value = element;
            }
            current = current.next;
        }
    }

    @Override
    public void delete(int index) {
        if (index > size && index < 0) throw new IndexOutOfBoundsException();
        Node<T> current = head;
        Node<T> newCurrent = null;
        int indexForChange = 0;
        if (index == 0) {
            head = head.next;
            head.prev = null;
            newCurrent = head;
            size--;
        }
        if (index == tall.index) {
            tall = tall.prev;
            tall.next = null;
            size--;
        }
        while (current != null && index != 0 && index != tall.index) {
            if (current.index == index) {
                current.prev.next = current.next;
                newCurrent = current.next;
                current.next.prev = current.prev;
                current.next = null;
                current.prev = null;
                size--;
                indexForChange = current.index;
            }
            current = current.next;
        }
        while (newCurrent != null) {
            newCurrent.index = indexForChange++;
            newCurrent = newCurrent.next;
        }
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
        if (index > size) throw new IndexOutOfBoundsException();
        Node<T> current = head;
        while (current != null) {
            if (current.index == index) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean contains(T element) {
        Node<T> current = head;

        while (current != null) {
            if (current.value.equals(element)) return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<T> current = head;

        while (current != null) {
            sb.append("index-").append(current.index).append(" value-");
            sb.append(current.value);
            if (current.next != null) {
                sb.append(" -> ");
            }
            current = current.next;
        }

        return sb.append("]").toString();

    }
}
