package ir.mapsa.jobinja.services;

import ir.mapsa.jobinja.entities.ReservedList;
import ir.mapsa.jobinja.generic.GenericRepository;
import ir.mapsa.jobinja.generic.GenericServiceImp;
import ir.mapsa.jobinja.repositories.ReservedListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservedListService extends GenericServiceImp<ReservedList,Long> implements IReservedListService{

    private final ReservedListRepository repository;

    public ReservedListService(ReservedListRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<ReservedList, Long> getRepository() {
        return this.repository;
    }

    @Override
    public List<ReservedList> findByEmployerId(Long employerId){
        return repository.findAllByJobNotice_Employer_Id(employerId);
    }
}
