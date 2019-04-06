package mate.academy.hw7.dao;

public interface AbstractDao<T> {
    void save(T object);
    T get();
}
