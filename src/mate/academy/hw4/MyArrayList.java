package mate.academy.hw4;

import java.util.Arrays;

public class MyArrayList<T> implements List<T> {
    private int size = 0;
    private static final int CAPACITY = 16;
    private T[] array;

    public MyArrayList(int length) {
        array = (T[]) new Object[length];
    }

    public MyArrayList() {
        this(CAPACITY);
    }

    private void clear() {
        array = (T[]) new Object[CAPACITY];
        size = 0;
    }

    private void ensureCapacity(int value) {
        if (size * 2 < array.length) {
            array = Arrays.copyOf(array, array.length / 2);
        } else if (value >= CAPACITY) {
            array = Arrays.copyOf(array, value * 2);
        }
    }

    public void add(T value) {
        ensureCapacity(size);
        array[size++] = value;
    }

    public void add(T value, int index) {
        checkIndex(index - 1);
        ensureCapacity(size);
        int lengthOfCopy = size - index;
        System.arraycopy(array, index, array, index + 1, lengthOfCopy);
        array[index] = value;
        size++;
    }

    public void addAll(List<T> list) {
        ensureCapacity(size + list.size());
        T[] arrayList = list.toArray();
        System.arraycopy(arrayList, 0, array, size, list.size());
        size += list.size();
    }

    public T[] toArray() {
        return Arrays.copyOf(array, size);
    }

    private void checkIndex(int index) {
        if ((index > size - 1) || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public T get(int index) {
        checkIndex(index);
        return array[index];
    }

    public void set(T value, int index) {
        checkIndex(index - 1);
        if (index == size) {
            add(value);
        } else {
            array[index] = value;
        }
    }

    public T remove(int index) {
        T result = get(index);
        int lengthOfCopy = size - index - 1;
        System.arraycopy(array, index + 1, array, index, lengthOfCopy);
        array[--size] = null;
        ensureCapacity(0);
        return result;
    }

    public T remove(T t) {
        for (int i = 0; i < size; i++) {
            if (t.equals(array[i])) {
                return remove(i);
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(array[0]);
        for (int i = 1; i < size; i++) {
            if (array[i] == null) {
                continue;
            }
            result.append(", ").append(array[i]);
        }
        return result.toString();
    }
}
