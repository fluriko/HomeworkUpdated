package mate.academy.hw4;

import java.util.Arrays;

public class MyArrayList<T> implements List<T> {
    private int size = 0;
    private int capacity = 10;
    private T[] array = (T[]) new Object[capacity];

    private void clear() {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    private void ensureCapacity(int value) {
        if (value == capacity) {
            capacity *= 2;
            array = Arrays.copyOf(array, capacity);
        }
    }

    public void add(T value) {
        ensureCapacity(size);
        array[size++] = value;
    }

    public void add(T value, int index) {
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

    public T get(int index) {
        if ((index > size() - 1) || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public void set(T value, int index) {
        if ((index > size()) || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if (index == size) {
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
