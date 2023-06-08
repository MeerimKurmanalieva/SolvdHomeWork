package myData;

import java.util.List;

public interface Service<T> {
    T getById(int id);
    List<T> getAll();
    void save(T obj);
    void update(T obj);
    void delete(T obj);
}

