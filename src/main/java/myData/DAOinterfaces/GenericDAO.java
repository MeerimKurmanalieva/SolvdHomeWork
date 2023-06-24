package myData.DAOinterfaces;

import java.util.List;

public interface GenericDAO<T> {
    T create(T entity);
    T read(int id);
    T update(T entity);
    void delete(T entity);

    List<T> getAll();
}

