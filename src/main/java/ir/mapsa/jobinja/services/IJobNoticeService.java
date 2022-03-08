package ir.mapsa.jobinja.services;

import ir.mapsa.jobinja.entities.JobNotice;
import ir.mapsa.jobinja.generic.IGenericService;
import ir.mapsa.jobinja.utile.dynamicFilter.NoticeSpecification;

import java.util.List;

public interface IJobNoticeService extends IGenericService<JobNotice,Long> {

    void save(JobNotice jobNotice,Long employerId);
    List<JobNotice> findAll(NoticeSpecification specification);
}
