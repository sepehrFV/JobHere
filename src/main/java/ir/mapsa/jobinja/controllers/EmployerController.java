package ir.mapsa.jobinja.controllers;

import ir.mapsa.jobinja.dto.EmployerDTO;
import ir.mapsa.jobinja.dto.ReservedListDTO;
import ir.mapsa.jobinja.entities.Employer;
import ir.mapsa.jobinja.entities.ReservedList;
import ir.mapsa.jobinja.mapper.EmployerMapper;


import ir.mapsa.jobinja.mapper.ReservedListMapper;
import ir.mapsa.jobinja.services.IEmployerService;
import ir.mapsa.jobinja.services.IReservedListService;
import ir.mapsa.jobinja.services.ReservedListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/employer")
public class EmployerController {

    private final IEmployerService service;
    private final IReservedListService reservedListService;
    private final EmployerMapper mapper;
    private final ReservedListMapper reservedListMapper;

    public EmployerController(IEmployerService service, IReservedListService reservedListService, EmployerMapper mapper, ReservedListMapper reservedListMapper) {
        this.service = service;
        this.reservedListService = reservedListService;
        this.mapper = mapper;
        this.reservedListMapper = reservedListMapper;
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Void> save(@RequestBody @Valid EmployerDTO employerDTO) {

        service.save(mapper.toEntity(employerDTO));
            return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping(value = "/getAll")
    public ResponseEntity<List<EmployerDTO>> getAll() {
        return new ResponseEntity<>(mapper.toDtoes(service.findAll()),HttpStatus.OK);
    }


    @DeleteMapping(value = "/deleteById/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getRequests/{employerId}")
    public ResponseEntity<List<ReservedList>> getRequests(@PathVariable Long employerId) {
       // return ResponseEntity.ok(reservedListMapper.toDtoes(reservedListService.findByEmployerId(employerId)));
        return new ResponseEntity<>(reservedListService.findByEmployerId(employerId),HttpStatus.OK);
    }


}
