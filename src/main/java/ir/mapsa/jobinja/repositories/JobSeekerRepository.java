package ir.mapsa.jobinja.repositories;

import ir.mapsa.jobinja.entities.JobSeeker;
import ir.mapsa.jobinja.generic.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobSeekerRepository extends GenericRepository<JobSeeker,Long> {

}
