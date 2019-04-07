package mate.academy.hw7.dao;

import java.util.List;

public interface AbstractDao<T> {
    void save(T object);
    List<T> get();
}
