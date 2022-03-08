package ir.mapsa.jobinja.services;


import ir.mapsa.jobinja.entities.Employer;
import ir.mapsa.jobinja.generic.GenericRepository;
import ir.mapsa.jobinja.generic.GenericServiceImp;
import ir.mapsa.jobinja.repositories.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerService extends GenericServiceImp<Employer,Long> implements IEmployerService {

    private EmployerRepository repository;

    public EmployerService(EmployerRepository repository) {
        this.repository = repository;
    }


    @Override
    protected GenericRepository<Employer, Long> getRepository() {
        return this.repository;
    }
}
