package ir.mapsa.jobinja.services;

import ir.mapsa.jobinja.entities.JobSeeker;
import ir.mapsa.jobinja.generic.IGenericService;

public interface IJobSeekerService extends IGenericService<JobSeeker,Long> {

    void requestJob(Long jobNoticeId,Long jobSeekerId);

}
