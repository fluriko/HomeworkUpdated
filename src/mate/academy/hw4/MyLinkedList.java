package mate.academy.hw4;

public class MyLinkedList<T> implements List<T>{
    private int size = 0;
    private Node<T> firstNode;
    private Node<T> lastNode;

    private class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> previous;

        private Node(T value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public void add(T value) {
        if (size == 0) {
            firstNode = new Node<>(value, lastNode, null);
            lastNode = firstNode;
        } else if (size == 1) {
            lastNode = new Node<>(value, null, firstNode);
            firstNode.next = lastNode;
        } else {
            Node<T> newNode = new Node<>(value, lastNode, null);
            lastNode.next = newNode;
            lastNode = newNode;
        }
        size++;
    }

    private void checkIndex(int index) {
        if ((index > size - 1) || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void add(T value, int index) {
        checkIndex(index - 1);
        if (index == size) {
            add(value);
        } else if (index == 0) {
            Node<T> newNode = new Node<>(value, firstNode, null);
            firstNode.previous = newNode;
            firstNode = newNode;
        } else {
            Node<T> next = getNode(index);
            Node<T> prev = getNode(index - 1);
            Node<T> newNode = new Node<>(value, next, prev);
            next.previous = newNode;
            prev.next = newNode;
        }
        size++;
    }

    public void addAll(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            this.add(list.get(i));
        }
    }

    public void addAll(MyLinkedList<T> linkedList) {
        Node<T> lastThis = this.lastNode;
        Node<T> firstAnother = linkedList.firstNode;
        Node<T> lastAnother = linkedList.lastNode;
        lastThis.next = firstAnother;
        firstAnother.previous = lastThis;
        lastNode = lastAnother;
        size += linkedList.size;
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            result[i] = get(i);
        }
        return result;
    }

    public void set(T value, int index) {
        Node<T> toReplace = getNode(index);
        toReplace.value = value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T remove(T value) {
        for (int i = 0; i < size(); i++) {
            if (value.equals(get(i))) {
                return remove(i);
            }
        }
        return null;
    }

    public T remove(int index) {
        checkIndex(index);
        Node<T> removed = getNode(index);
        if (index == 0) {
            firstNode = getNode(index + 1);
            firstNode.next = getNode(index + 2);
            firstNode.previous = null;
        } else if (index == size - 1) {
            lastNode = getNode(index - 1);
            lastNode.next = null;
            lastNode.previous = getNode(index - 2);
        } else {
            Node<T> prev = getNode(index - 1);
            Node<T> next = getNode(index + 1);
            prev.next = next;
            next.previous = prev;
        }
        size--;
        return removed.value;
    }

    private Node<T> getNode(int index) {
        checkIndex(index);
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public T get(int index) {
        checkIndex(index);
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder(get(0).toString());
        for (int i = 1; i < size; i++) {
            result.append(", ");
            result.append(get(i));
        }
        result.append(".");
        return result.toString();
    }

    public int size() {
        return size;
    }
}
