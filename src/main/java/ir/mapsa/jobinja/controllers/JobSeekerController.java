package ir.mapsa.jobinja.controllers;

import ir.mapsa.jobinja.dto.JobNoticeDTO;
import ir.mapsa.jobinja.dto.JobSeekerDTO;
import ir.mapsa.jobinja.entities.JobNotice;
import ir.mapsa.jobinja.entities.JobSeeker;
import ir.mapsa.jobinja.mapper.JobNoticeMapper;
import ir.mapsa.jobinja.mapper.JobSeekerMapper;
import ir.mapsa.jobinja.services.IJobNoticeService;
import ir.mapsa.jobinja.services.IJobSeekerService;
import ir.mapsa.jobinja.services.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/jobSeeker")
public class JobSeekerController {


    private final IJobSeekerService service;
    private final IJobNoticeService jobNoticeService;
    private final JobSeekerMapper mapper;
    private final JobNoticeMapper jobNoticeMapper;

    public JobSeekerController(IJobSeekerService service, IJobNoticeService jobNoticeService, JobSeekerMapper mapper, JobNoticeMapper jobNoticeMapper) {
        this.service = service;
        this.jobNoticeService = jobNoticeService;
        this.mapper = mapper;
        this.jobNoticeMapper = jobNoticeMapper;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Void> save(@RequestBody @Valid JobSeekerDTO jobSeekerDTO) {

        JobSeeker js = mapper.toEntity(jobSeekerDTO);
        service.save(js);
        return new ResponseEntity<>(HttpStatus.CREATED);


    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<JobSeekerDTO>> getAll() {
        return new ResponseEntity<>(mapper.toDtoes(service.findAll()),HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/requestJob/{noticeId}/{jobSeekerId}")
    public ResponseEntity<Void> reqJob(@PathVariable("noticeId") Long noticeId, @PathVariable("jobSeekerId") Long jobSeekerId) {
        service.requestJob(noticeId, jobSeekerId);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @GetMapping("/getJobNotices")
    public ResponseEntity<List<JobNoticeDTO>> getAllNotices(){
      return ResponseEntity.ok(jobNoticeMapper.toDtoes(jobNoticeService.findAll()));
    }

}
