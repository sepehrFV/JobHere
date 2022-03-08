package ir.mapsa.jobinja.repositories;

import ir.mapsa.jobinja.entities.Employer;
import ir.mapsa.jobinja.generic.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends GenericRepository<Employer,Long> {

}
