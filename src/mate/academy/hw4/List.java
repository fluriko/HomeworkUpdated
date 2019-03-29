package mate.academy.hw4;

// Реализовать свой ArrayList и LinkedList исходя из интерфейса
public interface List<T> {

    void add(T value);
    void add(T value, int index);
    void addAll(List<T> list);
    T get(int index);
    void set(T value, int index);
    T remove(int index); // возвращаем элемент, который удалили
    T remove(T t); // удалять первый, который встретится
    int size();
    boolean isEmpty();
    T[] toArray();
}