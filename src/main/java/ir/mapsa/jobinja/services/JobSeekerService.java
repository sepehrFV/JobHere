package ir.mapsa.jobinja.services;

import ir.mapsa.jobinja.entities.JobNotice;
import ir.mapsa.jobinja.entities.JobSeeker;
import ir.mapsa.jobinja.entities.ReservedList;
import ir.mapsa.jobinja.generic.GenericRepository;
import ir.mapsa.jobinja.generic.GenericServiceImp;
import ir.mapsa.jobinja.repositories.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@Service
public class JobSeekerService extends GenericServiceImp<JobSeeker,Long> implements IJobSeekerService{


    private final JobSeekerRepository repository;
    private final JobNoticeService jobNoticeService;
    private final ReservedListService reservedListService;

    public JobSeekerService(JobSeekerRepository repository, JobNoticeService jobNoticeService, ReservedListService reservedListService) {
        this.repository = repository;
        this.jobNoticeService = jobNoticeService;
        this.reservedListService = reservedListService;
    }

    @Override
    protected GenericRepository<JobSeeker, Long> getRepository() {
        return this.repository;
    }

    @Override
    public void requestJob(Long jobNoticeId,Long jobSeekerId) {

        ReservedList rl = new ReservedList();

        if(jobNoticeService.existById(jobNoticeId)){
           JobNotice jn = jobNoticeService.findById(jobNoticeId).get();
            rl.setJobNotice(jn);
        }if(repository.existsById(jobSeekerId)){
            JobSeeker js = repository.findById(jobSeekerId).get();
            rl.setJobSeeker(js);
            reservedListService.save(rl);
        }else throw new NotFoundException("Not found");


    }


}
