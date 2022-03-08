package ir.mapsa.jobinja.mapper;

import ir.mapsa.jobinja.dto.JobSeekerDTO;
import ir.mapsa.jobinja.dto.ReservedListDTO;
import ir.mapsa.jobinja.entities.JobSeeker;
import ir.mapsa.jobinja.entities.ReservedList;
import ir.mapsa.jobinja.generic.GenericMapper;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ReservedListMapper extends GenericMapper<ReservedList, ReservedListDTO> {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE )
    void update(@MappingTarget ReservedList entity, ReservedListDTO dto);
}
