package ir.mapsa.jobinja.repositories;

import ir.mapsa.jobinja.entities.ReservedList;
import ir.mapsa.jobinja.generic.GenericRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservedListRepository extends GenericRepository<ReservedList,Long> {

    List<ReservedList> findAllByJobNotice_Employer_Id(Long employerId);
}
