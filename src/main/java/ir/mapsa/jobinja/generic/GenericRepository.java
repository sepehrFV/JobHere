package ir.mapsa.jobinja.generic;



import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;


@NoRepositoryBean
public interface GenericRepository<T,ID> extends PagingAndSortingRepository<T,ID> , JpaRepository<T,ID> {

    List<T> findAll(Specification<T> spec);
    List<T> findAll();

}
