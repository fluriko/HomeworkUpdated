package mate.academy.hw5;

public class MyStack<T> {
    private static final int CAPACITY = 20;
    private int size = 0;
    private T[] array;

    public MyStack() {
        this(CAPACITY);
    }

    public MyStack(int capacity) {
        array = (T[]) new Object[capacity];
    }

    private boolean checkSize() {
        return size == array.length;
    }

    public boolean push(T value) {
        if (checkSize()) {
            return false;
        }
        array[size++] = value;
        return true;
    }

    public void remove() {
        if (size != 0) {
            array[size--] = null;
        }
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return array[size - 1];
    }

    public T pop() {
        T bottom = peek();
        remove();
        return bottom;
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
