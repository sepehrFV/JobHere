package ir.mapsa.jobinja.generic;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T,ID> {

    List<T> findAll();
    boolean existById(ID id);
    void save(T entity);
    Optional<T> findById(ID id);
    void deleteById(ID id);

}
