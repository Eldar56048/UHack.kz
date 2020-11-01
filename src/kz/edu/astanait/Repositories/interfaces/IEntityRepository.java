package kz.edu.astanait.Repositories.interfaces;

import java.sql.SQLException;
import java.util.List;

public interface IEntityRepository<T> {
    int add(T entity);
    void update(T entity);
    void remove(T entity);
    List<T> query(String sql);
    T queryOne(String sql);
}
    