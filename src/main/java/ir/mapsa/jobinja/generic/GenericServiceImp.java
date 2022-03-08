package ir.mapsa.jobinja.generic;

import ir.mapsa.jobinja.exceptions.NotFoundException;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public abstract class GenericServiceImp<T,ID> implements IGenericService<T,ID>{

    protected abstract GenericRepository<T,ID> getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public boolean existById(ID id) {
        return getRepository().findById(id).isPresent();
    }

    @Override
    public void save(T entity) {
        getRepository().save(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
       if(existById(id)){
           return getRepository().findById(id);
       }else throw new NotFoundException("ID not found");

    }

    @Override
    public void deleteById(ID id) {
        if (existById(id)){
            getRepository().deleteById(id);
        }else throw new RuntimeException("operation canceled because id does not exist"+"id:"+id);


    }
}
