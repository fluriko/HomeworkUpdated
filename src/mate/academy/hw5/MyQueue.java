package mate.academy.hw5;

public class MyQueue<T> {
    private static final int CAPACITY = 20;
    private int size = 0;
    private T[] array;

    public MyQueue() {
        this(CAPACITY);
    }

    public MyQueue(int capacity) {
        array = (T[]) new Object[capacity];
    }

    private boolean checkSize() {
        return size == array.length;
    }

    public boolean add(T value) {
        if (checkSize()) {
            return false;
        }
        array[size++] = value;
        return true;
    }

    public void remove() {
        if (size != 0) {
            System.arraycopy(array, 1, array, 0, size);
            size--;
        }
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return array[0];
    }

    public T poll() {
        T head = peek();
        remove();
        return head;
    }


    public void clear() {
        array = (T[]) new Object[CAPACITY];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(array[0].toString());
        for (int i = 1; i < size; i++) {
            if (array[i] != null) {
                result.append(", ").append(array[i]);
            }
        }
        return result.toString();
    }
}
