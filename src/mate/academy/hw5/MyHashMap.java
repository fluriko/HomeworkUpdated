package mate.academy.hw5;

public class MyHashMap<K, V> {
    private static final int CAPACITY = 16;
    private int size = 0;
    private Node<K, V>[] table;

    public MyHashMap(int capacity) {
        table = (Node<K, V>[]) new Node[capacity];
    }

    public MyHashMap() {
        this(CAPACITY);
    }

    private static class Node<K, V> {
        private final int hash;
        private final K key;
        private V value;
        private Node<K, V> next;

        Node(int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public final V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }

        @Override
        public String toString() {
            return key + " has value: " + value;
        }
    }

    private void increase() {
        if (size - 1 >= table.length) {
            indexRedistribution();
        }
    }

    private void addNode(Node<K, V> node) {
        put(node.key, node.value);
    }

    private void indexRedistribution() {
        Node<K, V>[] tableOld = table;
        table = (Node<K, V>[]) new Node[size * 2];
        for (int i = 0; i < tableOld.length; i++) {
            if (tableOld[i] != null) {
                addNode(tableOld[i]);
            }
        }
    }

    private final int hash(K key) {
        return key.hashCode() * 12;
    }

    public void put(K key, V value) {
        increase();
        if (indexOf(key) != -1) {
            Node<K, V> current = getNode(key);
            current.setValue(value);
        } else {
            Node<K, V> current = new Node<>(hash(key), key, value, null);
            int index = hash(key) % table.length;
            if (table[index] != null) {
                table[index].next = current;
            } else {
                table[index] = current;
            }
        }
        size++;
    }

    public V get(K key) {
        Node<K, V> node = getNode(key);
        return node.value;
    }

    private Node<K, V> getNode(K key) {
        for (int i = 0; i < table.length; i++) {
            if ((table[i] != null) && (table[i].hash == hash(key))) {
                return table[i];
            }
        }
        return null;
    }

    public V remove(K key) {
        Node<K, V> node = getNode(key);
        table[indexOf(key)] = null;
        size--;
        return node.value;
    }

    private int indexOf(K key) {
        for (int i = 0; i < table.length; i++) {
            if ((table[i] != null) && (hash(key) == (table[i].hash))) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(K key) {
        if (get(key) == null) {
            return false;
        }
        return true;
    }

    public void clear() {
        table = (Node<K, V>[]) new Node[CAPACITY];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        int indexOfFirst = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                result.append(table[i]);
                indexOfFirst = i + 1;
                break;
            }
        }
        for (int i = indexOfFirst; i < table.length; i++) {
            if (table[i] != null) {
                result.append(", ").append(table[i]);
            }
        }
        result.append("]");
        return result.toString();
    }
}
