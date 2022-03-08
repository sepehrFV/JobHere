package ir.mapsa.jobinja.repositories;

import ir.mapsa.jobinja.entities.JobNotice;
import ir.mapsa.jobinja.generic.GenericRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobNoticeRepository extends GenericRepository<JobNotice,Long> {

}
