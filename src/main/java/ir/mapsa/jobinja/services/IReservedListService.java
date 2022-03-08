package ir.mapsa.jobinja.services;

import ir.mapsa.jobinja.entities.ReservedList;
import ir.mapsa.jobinja.generic.IGenericService;

import java.util.List;

public interface IReservedListService extends IGenericService<ReservedList,Long> {
    List<ReservedList> findByEmployerId(Long employerId);
}
