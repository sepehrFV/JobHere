package ir.mapsa.jobinja.services;

import ir.mapsa.jobinja.entities.Employer;
import ir.mapsa.jobinja.entities.JobNotice;
import ir.mapsa.jobinja.exceptions.NotFoundException;
import ir.mapsa.jobinja.generic.GenericRepository;
import ir.mapsa.jobinja.generic.GenericServiceImp;
import ir.mapsa.jobinja.repositories.JobNoticeRepository;
import ir.mapsa.jobinja.utile.dynamicFilter.NoticeSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobNoticeService extends GenericServiceImp<JobNotice,Long> implements IJobNoticeService {


    private final JobNoticeRepository repository;
    private final EmployerService employerService;

    public JobNoticeService(JobNoticeRepository repository, EmployerService employerService) {
        this.repository = repository;
        this.employerService = employerService;
    }

    @Override
    protected GenericRepository<JobNotice, Long> getRepository() {
        return this.repository;
    }


    @Override
    public void save(JobNotice jobNotice, Long employerId) {
            if(employerService.existById(employerId)) {
                Employer e = employerService.findById(employerId).get();
                jobNotice.setEmployer(e);
                repository.save(jobNotice);
            }else throw new NotFoundException("employer not found");

        }

    @Override
    public List<JobNotice> findAll(NoticeSpecification specification) {
        return repository.findAll(specification);
    }


}

