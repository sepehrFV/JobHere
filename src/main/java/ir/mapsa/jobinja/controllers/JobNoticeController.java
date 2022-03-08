package ir.mapsa.jobinja.controllers;

import ir.mapsa.jobinja.dto.JobNoticeDTO;
import ir.mapsa.jobinja.entities.JobNotice;
import ir.mapsa.jobinja.mapper.JobNoticeMapper;
import ir.mapsa.jobinja.services.IJobNoticeService;
import ir.mapsa.jobinja.utile.dynamicFilter.NoticeSpecification;
import ir.mapsa.jobinja.utile.dynamicFilter.Criteria;
import ir.mapsa.jobinja.generic.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/jobNotice")
public class JobNoticeController {


    private final IJobNoticeService service;
    private final JobNoticeMapper mapper;

    public JobNoticeController(IJobNoticeService service, JobNoticeMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @PostMapping(value = "/save/{employerId}")
    public ResponseEntity<Void> save(@RequestBody @Valid JobNoticeDTO jobNoticeDTO, @PathVariable("employerId") Long employerId) {

        service.save(mapper.toEntity(jobNoticeDTO), employerId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<JobNoticeDTO>> getAll() {
        return new ResponseEntity<>(mapper.toDtoes(service.findAll()),HttpStatus.OK);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/search")
    List<JobNotice> search(@RequestBody List<Criteria> searchCriteria) {

        NoticeSpecification specification = new NoticeSpecification(searchCriteria);
        return service.findAll(specification);
    }


}
