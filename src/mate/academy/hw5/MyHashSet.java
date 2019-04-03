package mate.academy.hw5;

public class MyHashSet<K> {
    private MyHashMap<K, Object> myHashMap;
    private Object value = new Object();

    public MyHashSet() {
        myHashMap = new MyHashMap<>();
    }

    public MyHashSet(int capacity) {
        myHashMap = new MyHashMap<>(capacity);
    }

    public int size() {
        return myHashMap.size();
    }

    public void clear() {
        myHashMap.clear();
    }

    public void put(K key) {
        myHashMap.put(key, value);
    }

    public void remove(K key) {
        myHashMap.remove(key);
    }

    public boolean contains(K key) {
        return myHashMap.contains(key);
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "myHashMap=" + myHashMap +
                '}';
    }
}
